package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//nesse caso, estou especificando que o ID desse bean é justamente theSillyCoach
@Component("theSillyCoach")
public class TennisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
		
	}
	
}
