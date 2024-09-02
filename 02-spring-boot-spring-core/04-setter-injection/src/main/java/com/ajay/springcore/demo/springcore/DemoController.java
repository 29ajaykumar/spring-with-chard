package com.ajay.springcore.demo.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	private Coach myCoach;

	@GetMapping("/dailyWorkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
}
