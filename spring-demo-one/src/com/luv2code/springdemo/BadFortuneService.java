package com.luv2code.springdemo;

public class BadFortuneService implements FortuneService {
	
	private String array[];

	@Override
	public String getFortune() {
		
		int random = (int) (Math.random() * 2 + 1);
		
		array = new String[3];
		
		array[0] = "Today isnt your lucky day!";
		array[1] = "Today maybe is your lucky day.";
		array[2] = "I'm not sure if it is your lucky day.";
		
		return array[random];
	}

}
