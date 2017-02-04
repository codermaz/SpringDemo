package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class JavaCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Lernen ist gut";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
