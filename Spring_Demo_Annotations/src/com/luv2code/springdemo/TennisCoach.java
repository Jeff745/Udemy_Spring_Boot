package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//Adding java annotation to class
//Uses default bean id
@Component

public class TennisCoach implements coach {

	@Override
	public String getDailyWorkout() {
		return "Return your backhand volley";
	}

}
