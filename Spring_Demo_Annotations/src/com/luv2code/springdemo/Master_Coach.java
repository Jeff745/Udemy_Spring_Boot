package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component

public class Master_Coach implements SoccerCoach {
	
	@Override

	public String WorkoutInstructions() {
		
		return "Do 5BX and run 3KM daily!";
		
	}

}
