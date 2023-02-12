package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		//Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifeCycle_applicationContext.xml");
		
		//Retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		//Check if they are the same
		boolean result = (theCoach == alphaCoach);
	
		//Print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach + "\n");
		
		System.out.println("Memory location for alphaCoach: " + alphaCoach + "\n");

		System.out.println(theCoach.getDailyWorkout());
		//2 seperate objects pointing to 2 different memory locations
		context.close();
	
	}

}
