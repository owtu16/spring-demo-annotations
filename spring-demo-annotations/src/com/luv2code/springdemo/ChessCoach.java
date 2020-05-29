package com.luv2code.springdemo;

public class ChessCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public ChessCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice chess for 2 hours everyday";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
