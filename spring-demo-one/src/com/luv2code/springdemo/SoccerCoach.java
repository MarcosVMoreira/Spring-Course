package com.luv2code.springdemo;

public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Score 50 goals";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public void doOnStartup() {
		System.out.println("SoccerCoach: Starting up spring.");
	}
	
	public void doOnCleanup() {
		System.out.println("SoccerCoach: Cleaning up spring.");
	}
	
	

}
