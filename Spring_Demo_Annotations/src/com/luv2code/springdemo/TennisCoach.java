package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Adding java annotation to class
//Uses default bean id

//Spring scans for component that implements FortuneService interface
//Eg HappyfortuneService meets the requirement
@Component
//@Scope("prototype") //Prototype: create new instance every time
public class TennisCoach implements coach { 

	//Config dependency injection with @Autowired Annotation
	
	@Autowired //Field injection. Spring will set value behind the scene. Call default constructor and uses java tech called reflection to inject fortuneService.
	@Qualifier("randomFortuneService") //Be specific, use @qualifier. Pass in bean name to inject into qualifier.
	private FortuneService fortuneService;
	
	//2-Create constructor in class for injections
	//3-Configure dependency injection with @Autowired annotation
    
	//Define a default constructor
	
	public TennisCoach() {
		
		System.out.println(">> TennisCoach:Inside default constructor");
		
	}
	
	//define my init method
	
	@PostConstruct
	public void doMyStartUpStuff() {
		
		System.out.println(">>TennisCoach: inside of doMyStartUpStuff()");
	}
	
	//define my destroy method
	
	@PreDestroy
	public void doMyCleanupStuff() {
		
		System.out.println(">>TennisCoach: inside of doMyCleanUpStuff()");

	}
	
//	//Define a setter method
//	//Config dependency injection with @Autowired
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		
//		System.out.println(">> TennisCoach:Inside setFortuneService");
//		fortuneService = theFortuneService;
//	}
	
	//Use any method name	
		//Config dependency injection with @Autowired
	
	/*
		@Autowired
		public void doSomeCrazyStuff(FortuneService theFortuneService) {
			
			System.out.println(">> TennisCoach:Inside DoCrazyStuff method");
			fortuneService = theFortuneService;
		}
	/*
	
	/*
	@Autowired

	public TennisCoach(FortuneService theFortuneService) {
		
		//assign parameter to a field
		fortuneService = theFortuneService;
		
	}
		
	*/
	
	//Placeing @Qualifier annotation inside constructor
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService theFortuneService) {
		
		System.out.println(">TennisCoach:inside constructor using @autowired and @qualifier");
		fortuneService  = theFortuneService;
		
	}
	
	@Override
	public String getDailyWorkout() {
		return "Return your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
