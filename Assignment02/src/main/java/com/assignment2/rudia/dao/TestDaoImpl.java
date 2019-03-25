package com.assignment2.rudia.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assignment2.rudia.vo.Students;

@Repository
public class TestDaoImpl implements TestDao{

	@Autowired
	private SqlSessionTemplate sqlsession;
	
	@Override
	public Students getStudent(String name) {
		return sqlsession.getMapper(TestMapper.class).getStudent(name);
	}

	

	
}
