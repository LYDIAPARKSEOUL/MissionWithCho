package com.assignment2.rudia.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.assignment2.rudia.vo.Students;

@Repository
public class TestDaoJdbc {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	class StudentMapper implements RowMapper<Students>{
		public Students mapRow(ResultSet rs, int rowNum) throws SQLException {
			Students  std = new Students();
			std.setName(rs.getString("name"));
			std.setAge(rs.getString("age"));
			std.setId(rs.getString("id"));
			return std;
		}
	}
	
	public List<Students> selectList(){
		String selectQuery ="SELECT NAME , CEIL((SYSDATE - BIRTHDAY) / 365 ) || '세'  AGE , ID FROM STUDENT ";
		List<Students> std  = jdbcTemplate.query( selectQuery, new StudentMapper() );
		logger.info("조회한다!");
		return std;
	}
	
}
