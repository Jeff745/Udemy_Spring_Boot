package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		//load spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		
		coach theCoach = context.getBean("tennisCoach", coach.class);
		
		coach alphaCoach = context.getBean("tennisCoach", coach.class);

		//Check if they are the same
		boolean result = (theCoach==alphaCoach);
		
		//print out results
		System.out.println("\nPointing to the same object: "+ result);
		System.out.println("\nMemory location for theCoach" + theCoach);
		System.out.println("\nMemory location for alphaCoach" + alphaCoach + "\n");
		
		//Close the context
		context.close();

	}

}
