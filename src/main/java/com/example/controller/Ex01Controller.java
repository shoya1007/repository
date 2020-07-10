package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Form;

@Controller
@RequestMapping("")
public class Ex01Controller {
	
	@ModelAttribute
	public Form setUpForm() {
		return new Form();
	}
	
	@RequestMapping("")
	public String index() {
		return "input";
	}
	
	@RequestMapping("/result")
	public String result(Form form, Model model) {
		
		model.addAttribute("form", form);
		
		return "result";
	}

}
