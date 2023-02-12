package com.luv2code.springdemo;

public class BaseBallCoach implements Coach {
	
	//Define private field for the dependency
	
	private FortuneService fortuneService;
	
	//Define constructor for dependency injection
	public BaseBallCoach(FortuneService theFortuneService)
	{
		fortuneService = theFortuneService;
		
	}
	
	@Override
	
	public String getDailyWorkout() {
		
		return "Spend 30mins on batting practise";
		
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneservice to get a fortune
		//dependency = helper
		return fortuneService.getFortune();
	}
	
	
	
}
