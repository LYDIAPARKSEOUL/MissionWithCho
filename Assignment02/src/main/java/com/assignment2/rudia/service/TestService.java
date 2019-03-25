package com.assignment2.rudia.service;

import java.util.List;

import com.assignment2.rudia.vo.Students;

public interface TestService {
	public Students getStrudent(String id);
	public List<Students> selectList();
}
