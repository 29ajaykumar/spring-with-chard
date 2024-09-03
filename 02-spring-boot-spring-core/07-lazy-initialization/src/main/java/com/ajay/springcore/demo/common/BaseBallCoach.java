package com.ajay.springcore.demo.common;


import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach {

	public BaseBallCoach() {
		System.out.println("In class : "+getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Spend 30 min on batting practice";
	}
 
}
