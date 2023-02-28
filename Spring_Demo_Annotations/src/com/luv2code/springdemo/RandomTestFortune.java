package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomTestFortune implements FortuneService {

	@Value("{luckMessage}")
	
	private String[] luckMessage;
	
	private Random testRandom = new Random();
	
	@Override
	public String getFortune() {
		int i = testRandom.nextInt(luckMessage.length);
		
		String message = luckMessage[i];
		
		return message;
	}

}
