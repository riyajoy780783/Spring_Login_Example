package com.face.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	
	@RequestMapping(value="/")
	public String index() {
		
		return "index";
	}
	
	
	@RequestMapping(value="/login")
	public String login() {
		
		return "login";
	}
	
	@RequestMapping(value="/register")
	public String register() {
		
		return "register";
	}
	
	@RequestMapping(value="/hello")
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) {
	
	String username = request.getParameter("t1");
	String password = request.getParameter("t2");
	
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("welcome");
	mv.addObject("username",username);
	return mv;
	}
	
	@RequestMapping(value="/success")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
	
	String username = request.getParameter("Username");
	String password = request.getParameter("Password");
	String fname = request.getParameter("FirstName");
	String lname = request.getParameter("LastName");
	String email = request.getParameter("Email");
	String mob = request.getParameter("Mobile");
	
	ModelAndView mv = new ModelAndView();
	mv.setViewName("registerform");
	mv.addObject("username",username);
	mv.addObject("password",password);
	mv.addObject("fname",fname);
	mv.addObject("lname",lname);
	mv.addObject("email",email);
	mv.addObject("mob",mob);
	
	return mv;
	}
}