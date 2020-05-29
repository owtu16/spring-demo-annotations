package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ChessMainApp {

	static AnnotationConfigApplicationContext ctx = 
			new AnnotationConfigApplicationContext(ChessConfig.class);
	
	public static void main(String[] args) {
		// 
		
		Coach x = ctx.getBean("chessCoach",Coach.class);
		
		// print out the results
		
		System.out.println("Your daily workout is: " + x.getDailyWorkout());
		System.out.println("Your daily fortune is: " + x.getDailyFortune());
		
		ctx.close();

	}

}
