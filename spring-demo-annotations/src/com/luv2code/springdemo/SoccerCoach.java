package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		
		return "Run two miles everyday";
	}

	@Override
	public String getDailyFortune() {
		// 
		return fortuneService.getFortune();
	}

}
