package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	
	//Retrieve bean from spring container
	public static void main(String[] args) {
		// Read Spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get bean from spring container
		
		//Use default bean id, same name as class, first letter is lowercase.
		coach theCoach = context.getBean("tennisCoach", coach.class);
		//call a method on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		//close the context

			context.close();
	}
	
	//If use different bean id, explicit bean id is not given.
	//Bean is registered with default bean id
	//Need to use default bean id in our app.

}
