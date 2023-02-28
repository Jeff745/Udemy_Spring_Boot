package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Master_Coach implements SoccerCoach {
	
	@Override

	public String WorkoutInstructions() {
		
		return "Do 5BX and run 3KM daily!";
		
		
		
	}
	
	@Value("{foo.email}")
	private String email;
	
	@Value("{foo.team}")
	private String team;

}
