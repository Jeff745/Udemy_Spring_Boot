package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component

public class RandomFortuneService implements FortuneService {

	//Create an array of Strings
	
	private String[] data = {"Beware of the wolf in sheep's clothing", "The journey is the reward", "Train up and work hard to succeed."};
	
	private Random myRandom = new Random();
	@Override
	public String getFortune() {
		// Pick random string from the array
		
		int index = myRandom.nextInt(data.length); //Gives random number based on size of array
		
		String theFortune = data[index]; //get random string from array based on index
		
		return theFortune;
	}

}
