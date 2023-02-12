package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
				
	}
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It!! " + fortuneService.getFortune();
	}
	
	//Add an init method 
	public void doMyStartUpStuff() {
		System.out.println("Trackcoach:inside method doMyStartupStuff");
		
	}
	
	//Add a destroy method
	
	public void doMyCleanUpStuffYoYo() {
		System.out.println("Trackcoach:inside method doMyCleanUpStuffYoYo");
		
	}
}
