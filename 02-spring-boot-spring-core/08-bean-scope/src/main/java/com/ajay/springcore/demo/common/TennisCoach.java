package com.ajay.springcore.demo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your back hand volley";
	}

}
