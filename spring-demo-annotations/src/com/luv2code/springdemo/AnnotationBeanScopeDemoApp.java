package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring config file
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = ctx.getBean("tennisCoach",Coach.class);
		
		Coach alphacoach = ctx.getBean("tennisCoach",Coach.class);
		
		// check if they are the same
		
		boolean result = (theCoach == alphacoach);
		
		// print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for the theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphacoach + "\n");
		
		// call methods from the bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		ctx.close();

	}

}
