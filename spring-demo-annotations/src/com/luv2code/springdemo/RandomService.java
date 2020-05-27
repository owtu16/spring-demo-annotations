package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RandomService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "You'll have 100 years of good luck";
	}

}
