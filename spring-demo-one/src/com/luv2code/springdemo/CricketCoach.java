package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAdress, team;
	
	public CricketCoach () {
		System.out.println("CricketCoach: Inside no-arg the constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// injeção por setter
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public String getTeam() {
		return team;
	}
	

}
