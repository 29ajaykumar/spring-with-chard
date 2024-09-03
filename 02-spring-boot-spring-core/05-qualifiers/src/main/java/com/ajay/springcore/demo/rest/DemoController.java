package com.ajay.springcore.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.springcore.demo.common.Coach;

@RestController
public class DemoController {

	@Autowired
	@Qualifier("baseBallCoach")
	private Coach myCoach;

	@Autowired
	public DemoController(@Qualifier("tennisCoach")Coach myCoach) {
		this.myCoach = myCoach;
	}


	@GetMapping("/dailyWorkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
}
