package com.ajay.springcore.demo.common;


import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	
	public TennisCoach() {
		System.out.println("In class : "+getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your back hand volley";
	}
 
}
