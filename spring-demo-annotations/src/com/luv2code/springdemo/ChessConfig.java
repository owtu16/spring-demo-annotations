package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChessConfig {
	
	@Bean
	public FortuneService fortuneService() {
		return new WildWestFortune();
	}

	@Bean
	public Coach chessCoach() {
		return new ChessCoach(fortuneService());
	}
}
