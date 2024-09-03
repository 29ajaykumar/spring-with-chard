package com.ajay.springcore.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajay.springcore.demo.common.Coach;

@RestController
public class DemoController {

	// @Qualifier priority is high if we use @Primary and @Qualifier
	// it means we can use both at a time
	private Coach myCoach;

	@Autowired
	public DemoController(@Qualifier("tennisCoach")Coach myCoach) {
		System.out.println("In class : "+getClass().getSimpleName());
		this.myCoach = myCoach;
	}


	@GetMapping("/dailyWorkout")
	public String getDailyWorkout() {
		return myCoach.getDailyWorkout();
	}
}
