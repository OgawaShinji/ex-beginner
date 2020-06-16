package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex02")
public class Exam02Controller {

	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		return "ex02/exam02";
	}
	@RequestMapping("result")
	public String result(Integer left,Integer right ) {
		
		session.setAttribute("left", left);
		session.setAttribute("right", right);
		session.setAttribute("result", left+right);
		
		return "/inputQ1/result";
	}
	
	
}
