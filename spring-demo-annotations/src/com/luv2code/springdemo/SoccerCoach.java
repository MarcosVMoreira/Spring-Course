package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

//nesse caso, estou permitindo que o Spring gere automaticamente para esse bean um id, sendo esse
//id o pr�prio nome da classe com a primeira letra min�scula. Nesse caso, o id � "soccerCoach"
@Component
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice 30 goals.";
	}
	

}
