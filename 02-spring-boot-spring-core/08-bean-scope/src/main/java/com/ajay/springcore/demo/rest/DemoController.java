package com.ajay.springcore.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.springcore.demo.common.Coach;

@RestController
public class DemoController {

	
	private Coach myCoach;
	private Coach myNewCoach;

	@Autowired
	public DemoController(@Qualifier("tennisCoach")Coach myCoach,@Qualifier("tennisCoach")Coach myNewCoach) {
		
		this.myCoach = myCoach;
		this.myNewCoach = myNewCoach;
	}

	@GetMapping("/checkBeanScope")
	public String checkBeanScope() {
		return "Is bean same?"+(this.myCoach==this.myNewCoach);
	}
	@GetMapping("/dailyWorkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
}
