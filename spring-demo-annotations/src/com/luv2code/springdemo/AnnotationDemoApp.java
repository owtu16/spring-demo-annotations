package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file
		ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		// get the bean from spring container
		Coach theCoach = ctx.getBean("tennisCoach",Coach.class);
		Coach soccerCoach = ctx.getBean("soccerCoach",Coach.class);
		// call a method on the bean
		System.out.println(theCoach.getClass().getSimpleName() + ": " + theCoach.getDailyWorkout() + "\n");
		System.out.println(soccerCoach.getClass().getSimpleName() + ": " + soccerCoach.getDailyWorkout() + "\n");
		// close the context
		ctx.close();

	}

}
