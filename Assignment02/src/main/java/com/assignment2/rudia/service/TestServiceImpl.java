package com.assignment2.rudia.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment2.rudia.dao.TestDao;
import com.assignment2.rudia.dao.TestDaoJdbc;
import com.assignment2.rudia.vo.Students;

@Service
public class TestServiceImpl implements TestService {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private TestDao  dao;
	
	@Autowired
	private TestDaoJdbc jdbc;
	
	@Override
	public Students getStrudent(String id) {
		return dao.getStudent(id);
	}

	@Override
	public List<Students> selectList() {
		return jdbc.selectList();
	}
}
