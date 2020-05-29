package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BaseballJavaConfigDemoApp {

	static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

	public static void print(String beanText, boolean includesMethods) {

		Coach x = context.getBean(beanText, Coach.class);

		System.out.println(x.getClass().getSimpleName() + ": " + x.getDailyWorkout());

		System.out.println("Your daily fortune according to your " + x.getClass().getSimpleName() + ": "
				+ x.getDailyFortune() + "\n");
		if(includesMethods) {
			System.out.println(((BaseballCoach)x).getEmail());
			System.out.println(((BaseballCoach)x).getTeam() + "\n");
		}
//		System.out.println(beanText);
//		context.close();
	}

	public static void main(String[] args) {
	
		
//		print("tennisCoach",false);
//		print("soccerCoach",false);
//		print("swimCoach",true);
//		print("hockeyCoach",false);
		print("baseballCoach",true);
		// close the context
		context.close();

	}

}
