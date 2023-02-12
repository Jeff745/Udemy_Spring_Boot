package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	//Create setters for setters injection
	
	private FortuneService fortuneService;
	
	//Add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	private String Random_Fortune;

	
	//Create a no-arg construtor
	
	//Spring calls this constructor first
	public CricketCoach() {
		
		System.out.println("CricketCoach: Inside no-arg constructor");
		
	}
	
	//Setter metods: Inject values into class
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside Setter method-SetEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside Setter method-SetTeam");
		this.team = team;
	}


	//Create setter method in class for injections
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside Setter method-SetFortuneService");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkout() {
		return "Practise fast bowling for 15mins";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	public String getRandom_Fortune() {
		return Random_Fortune;
	}

	public void setRandom_Forune(String random_Forune) {
		Random_Fortune = random_Forune;
	}
	
	
	
	
}

//FAQ: Why do we use CricketCoach class instead of Coach Interface?
//Question:
//
//For the CricketCoach example with Setter Injection, why do we use the CricketCoach class instead of the Coach interface?
//
//Answer:
//
//The getTeam() method is only defined in the CricketCoach class. It is not part of the Coach interface.
//
//As a result, you would need the following code:
//
//    CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class); 
//
//---
//
//The Coach interface has two methods: getDailyWorkout and getDailyFortune
//
//The CricketCoach class has four methods: getDailyWorkout, getDailyFortune, getTeam and setTeam
//
//---
//
//When you retrieve a bean from the Spring container using the Coach interface:
//
//    Coach theCricketCoach = context.getBean("myCricketCoach", Coach.class); 
//
//You only have access to the methods defined in the Coach interface: getDailyWorkout and getDailyFortune. Even though the actual implementation has additional methods, you only have visibility to methods that are defined at the Coach interface level.
//
//---
//
//When you retrieve a bean from the Spring container using the CricketCoach class:
//
//    CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class); 
//
//You have access to the methods defined in the Coach interface: getDailyWorkout and getDailyFortune.
//
//ALSO, you have access to the additional methods defined in the CricketCoach class: getTeam, setTeam.
//
//---
//
//The bottom line is it depends on how you retrieve the object and assign it ... that determines the visibility you have to the methods
