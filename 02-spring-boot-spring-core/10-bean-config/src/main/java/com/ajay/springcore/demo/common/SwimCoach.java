package com.ajay.springcore.demo.common;

public class SwimCoach implements Coach {

	public SwimCoach() {
		System.out.println("In Constructor " + getClass().getSimpleName());
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 100 m hard!!";
	}

}
