package com.ajay.springcore.demo.common;


import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Run 5k Hard!!";
	}
 
}
