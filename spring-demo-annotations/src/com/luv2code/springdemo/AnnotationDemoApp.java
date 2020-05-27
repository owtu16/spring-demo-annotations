package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void print(String beanText) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach x = context.getBean(beanText,Coach.class);
		
		System.out.println(x.getClass().getSimpleName() + ": " + x.getDailyWorkout());
		
		System.out.println("Your daily fortune according to your " + 
		x.getClass().getSimpleName() + ": " + x.getDailyFortune() + "\n");
		
		context.close();
	}

	public static void main(String[] args) {
		// read spring config file
//		ClassPathXmlApplicationContext ctx = 
//				new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
//		Coach theCoach = ctx.getBean("tennisCoach",Coach.class);
//		Coach soccerCoach = ctx.getBean("soccerCoach",Coach.class);
		// call a method on the bean
//		System.out.println(theCoach.getClass().getSimpleName() + ": " + theCoach.getDailyWorkout());
//		System.out.println(soccerCoach.getClass().getSimpleName() + ": " + soccerCoach.getDailyWorkout() + "\n");
		
		// call method to get the daily fortune
		
//		System.out.println("Your daily fortune according to your " + 
//		theCoach.getClass().getSimpleName() + ": " + theCoach.getDailyFortune());
//		
//		System.out.println("Your daily fortune according to your " + 
//		soccerCoach.getClass().getSimpleName() + ": " + soccerCoach.getDailyFortune());
		print("tennisCoach");
		print("soccerCoach");
		// close the context
//		ctx.close();

	}

}
