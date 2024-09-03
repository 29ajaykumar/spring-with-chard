package com.ajay.springcore.demo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

	public TennisCoach() {
		System.out.println("In Constructor " + getClass().getSimpleName());
	}

	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("doMyStartupStuff");
	}

	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("doMyCleanupStuff");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your back hand volley";
	}

}
