package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex04")
public class Exam04Controller {

	
	@RequestMapping("")
	public String Index() {
		return "ex04/exam04";
	}
}
