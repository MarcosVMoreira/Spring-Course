package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//nesse caso, estou permitindo que o Spring gere automaticamente para esse bean um id, sendo esse
//id o próprio nome da classe com a primeira letra minúscula. Nesse caso, o id é "soccerCoach"
@Component
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice 30 goals.";
	}
	

}
