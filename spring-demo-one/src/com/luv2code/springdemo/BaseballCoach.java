package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field
	
	private FortuneService fortuneService;
	
	//define the constructor for dependecy injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spent 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// isso é uma Injeção de Dependência
		
		// use my fortuneService to get a fortune
		
		// aqui eu recebo pego o fortune que o Spring me passa por referencia no construtor. Se o spring me passar
		// o HappyFortune, sairá uma coisa. Se eu criar um badFortune por exmeplo, sairá outra
		
		return fortuneService.getFortune();
		
	}

}
