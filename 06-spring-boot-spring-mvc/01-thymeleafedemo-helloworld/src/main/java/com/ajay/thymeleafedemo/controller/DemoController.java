package com.ajay.thymeleafedemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/hello")
	public String sayHellow(Model theModel) {
		theModel.addAttribute("theDate",java.time.LocalDateTime.now());
		return "helloworld";
	}
}
