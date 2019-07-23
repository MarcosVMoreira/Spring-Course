package com.luv2code.springdemo;

public class PracticeCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public PracticeCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice 8 hours.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}



}
