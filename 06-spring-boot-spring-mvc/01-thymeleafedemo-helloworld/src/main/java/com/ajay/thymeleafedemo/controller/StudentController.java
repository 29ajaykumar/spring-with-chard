package com.ajay.thymeleafedemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ajay.thymeleafedemo.model.Student;

@Controller
public class StudentController {

	@Value("${countriesList}")
	public List<String> countriesList;
	
	@Value("${languages}")
	public List<String> languages;
	
	@Value("${gender}")
	public List<String> genderList;
	
	@GetMapping("/showStudentForm")
	public String showForm(Model theModel) {
		Student theStudent = new Student();
		theModel.addAttribute("student",theStudent);
		theModel.addAttribute("countries", countriesList);
		theModel.addAttribute("languages", languages);
		theModel.addAttribute("genderlist", genderList);
		
		return "student-form";
	}
	@PostMapping("/processStudentForm")
	public String processStudentForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("Student Name :"+theStudent.getFirstName()+" "+theStudent.getLastName());
		System.out.println("language: "+theStudent.getLanguage());
		System.out.println("Gender: "+theStudent.getGender());
		return "student-confirmation";
		
	}
}
