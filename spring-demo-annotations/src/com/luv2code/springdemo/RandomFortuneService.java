package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of string
	private String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Early bird gets the worm",
			"Never stop learning"
	};
	
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "You'll have 100 years of good luck";
	}

}
