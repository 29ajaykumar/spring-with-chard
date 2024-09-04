package com.ajay.springcore.demo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ajay.springcore.demo.common.Coach;
import com.ajay.springcore.demo.common.SwimCoach;

@Configuration
public class SportConfig { 

	@Bean("myswimcoachid")
	public Coach swimCoach() {
		return new SwimCoach(); 
	}

}
