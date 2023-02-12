package com.luv2code.springdemo;

import java.util.Random;

public class Random_Fortune implements FortuneService {
	
	//Define 3 fortune element
	private String[] fortunes = {"Good luck", "Good Wealth", "Good Health"};

	//Create random generator
	private	Random Random_gen = new Random();
	@Override
	
	public String getFortune() {
		
		//Create string that has random element.
		String Fortunes_Random = fortunes[Random_gen.nextInt(fortunes.length)];
		
		
		return Fortunes_Random;
	
		
	}
	



}
