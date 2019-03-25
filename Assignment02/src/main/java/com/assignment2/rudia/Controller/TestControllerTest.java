package com.assignment2.rudia.Controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@RunWith(MockitoJUnitRunner.class)
public class TestControllerTest {
	
	@InjectMocks
	private TestController controller;
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void indexTest() throws Exception{
		mockMvc.perform(get("/index"))	// Get방식으로 해당 URL을 호출
					.andExpect(view().name("index")) // View이름이 index 인지 andExpect로 검증
					.andExpect(model().attributeExists("result")) // Model 속성에서 "result"가 존재하는지 검증
					.andExpect(model().attribute("result", "Hello Index Page")); // retult 값이 다음과 같이 세팅되었나 검증
	}
	
}
