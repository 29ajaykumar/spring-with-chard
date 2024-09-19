package com.ajay.thymeleafedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
	
	@RequestMapping(path =  "/showForm",method = RequestMethod.GET )
	public String showForm() {
		return "helloworld-form";
	}
	
	@GetMapping("/processForm")
	public String welcodePage() {
		return "welcome";
	}

	@GetMapping("/processFormV2")
	public String welcodePageV2(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		name = name.toUpperCase();
		model.addAttribute("name", name);
		return "welcome";
	}
	@GetMapping("/processFormV3")
	public String welcodePageV3(@RequestParam("studentName")  String name, Model model) {
		name = name.toUpperCase();
		model.addAttribute("name", name);
		return "welcome";
	}
	@PostMapping("/processFormV4")
	public String welcodePageV4(@RequestParam("studentName")  String name, Model model) {
		name = name.toUpperCase();
		model.addAttribute("name", name);
		return "welcome";
	}
}
