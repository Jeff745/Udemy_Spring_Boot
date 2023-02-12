package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	public static void main(String[] args) {

	//Load the spring config file
	ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("applicationContext.xml");
		
	//Retrieve bean from spring container
	CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
	
	//Call methods on the bean
	System.out.println(theCoach.getDailyWorkout());
	
	System.out.println(theCoach.getDailyFortune());

	//Call our new methods to get literal values
	System.out.println(theCoach.getTeam());
	System.out.println(theCoach.getEmailAddress());
	
	System.out.println(theCoach.getRandom_Fortune());

	//Close the context
	context.close();
	
	}
}
