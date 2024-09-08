package com.ajay.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.demo.entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api/v1")
public class StudentRestController {

	private List<Student> sl;

	@PostConstruct
	public void loadData() {
		sl = new ArrayList<Student>();
		Student s1 = new Student("AJAY", "Kumar");
		Student s2 = new Student("VIjay", "Singh");
		Student s3 = new Student("Sapna", "Singh");
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
	}

	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		return sl;
	}

	@GetMapping("/getStudents/{studentId}")
	public Student getStudents(@PathVariable int studentId) {
		if (studentId >= sl.size() || studentId < 0)
			throw new StudentNotFoundException("Student not found - " + studentId);
		return sl.get(studentId);
	}

	

}
