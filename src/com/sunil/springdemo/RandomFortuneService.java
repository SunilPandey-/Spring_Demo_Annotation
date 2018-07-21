package com.sunil.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings 
	private String[] data= {
			"Beaware of the wolf in sheep's clothing",
			"Dligince is the mother of good luck",
			"The journey is the reward"
	};
	// Random number generator 
	private Random myRandom = new Random(); 
	
	@Override
	public String getFortune() {
		// pick a random fortune out of the array
		int index = myRandom.nextInt(data.length);// get random number based on size of the array
		
		return data[index];
	}

}
