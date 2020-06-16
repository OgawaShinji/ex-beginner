package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class Exam01Controller {
	
	@RequestMapping("")
	public String index() {
		return "ex01/exam01";
	}
	
	@RequestMapping("/toresult")
	public String toResult(String name,Model model) {
		model.addAttribute("name", name);
		return "ex01/exam01-result";
	}
	
}
