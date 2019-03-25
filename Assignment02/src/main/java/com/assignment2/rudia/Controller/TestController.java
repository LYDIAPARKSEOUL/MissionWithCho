package com.assignment2.rudia.Controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.assignment2.rudia.service.TestService;
import com.assignment2.rudia.vo.InfoPerson;
import com.assignment2.rudia.vo.Students;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class TestController extends AbstractLogger {

	@Autowired 
	TestService testService;

	
	@RequestMapping(value="/index")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("result", "Hello Index Page");
		return mav;
	}
	
	@RequestMapping(value="/getStudent", method=RequestMethod.GET)
	public ModelAndView  getStudent(HttpServletRequest request) {
		ModelAndView  mav = new ModelAndView();
		String id = 	request.getParameter("id");
		logger.info(id);
		Students std = testService.getStrudent(id);
		logger.info(std.getName() +" | " + std.getAge()+ " | "+std.getId());
		mav.setViewName("home");
		mav.addObject("student", std);
		return mav;
	}
	
	@RequestMapping(value="/jdbcStatement")
	public String jdbcStatement() {
		return "jdbcStatement";
	}
	
	@RequestMapping(value="/jdbcPPStatement")
	public String jdbcPPStatement() {
		return "jdbcPPStatement";
	}
	
	@RequestMapping(value="/jdbcMetaData")
	public String jdbcMetaData() {
		return "jdbcMetaData";
	}
	@RequestMapping(value="/jdbcTransaction")
	public String jdbcTransaction() {
		return "jdbcTransaction";
	}
	
	
	@RequestMapping(value="/list")
	public String list(Model model) {
		List<Students> std = testService.selectList();
		model.addAttribute("student", std);
		return "list";
	}
	
	@RequestMapping(value="/getStudent2", method=RequestMethod.POST)
	public ModelAndView  getStudent2(HttpServletRequest request) {
		ModelAndView  mav = new ModelAndView();
		String id = 	request.getParameter("id");
		logger.info(id);
		Students std = testService.getStrudent(id);
		logger.info(std.getName() +" | " + std.getAge()+ " | "+std.getId());
		mav.setViewName("home");
		mav.addObject("student", std);
		return mav;
	}
	
	@RequestMapping(value="/json", method=RequestMethod.POST)
	public String  json(HttpServletRequest  request , Model model) throws IOException{
		String json = request.getParameter("json");		
		ObjectMapper mapper = new  ObjectMapper(); 
		InfoPerson person = mapper.readValue(json, InfoPerson.class);
		logger.info("이름 : "+person.name+", 나이 : "+ person.age);
		model.addAttribute("pp", person);
		return "index";
	}
	
	@RequestMapping(value="/multipart", method=RequestMethod.POST)
	public String  multipart(HttpServletRequest  request , Model model) throws IOException{
		return "index";
	}
	
	
}
