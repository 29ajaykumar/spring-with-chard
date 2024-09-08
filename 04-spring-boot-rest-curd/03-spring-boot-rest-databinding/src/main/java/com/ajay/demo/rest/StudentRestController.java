package com.ajay.demo.rest;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.demo.Student;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/v1")
public class StudentRestController {

	
	@GetMapping("/getStudentFromJSON")
	public List<Student> getStudentFromJSON() {
		ObjectMapper mapper = new ObjectMapper();
		
		List<Student> sl=null;
		try {
			// Load the file as a URL and get it as a File
            File jsonFile = new File("data/json-sample.json");

            // Convert the JSON file content to List of User objects
			sl = mapper.readValue(jsonFile, new TypeReference<List<Student>>() {});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sl;
	}
	
	@PostMapping( value = "/saveStudentInJSON",consumes = "application/json")
	public String saveStudentInJSON(@RequestBody List<Student> sl) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			// Load the file as a URL and get it as a File
            File jsonFile = new File("data/json-sample.json");

            // Save the received users to a file named output-sample.json
			mapper.writeValue(jsonFile, sl);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "SUCCESS";
	}
	
	
}
