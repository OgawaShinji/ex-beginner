package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "ex03/exam03";
	}
	@RequestMapping("/toresult")
	public String toResult(Integer firstItem, Integer secondItem, Integer thirdItem) {
		Integer sumPrice=firstItem+secondItem+thirdItem;
		
		double taxDouble=sumPrice*1.1;
		int taxInt=(int)taxDouble;
		Integer taxPrice=Integer.valueOf(taxInt);
		
		application.setAttribute("sumPrice", sumPrice);
		application.setAttribute("taxPrice", taxPrice);
		
		return "ex03/exam03-result";
	}
	
}
