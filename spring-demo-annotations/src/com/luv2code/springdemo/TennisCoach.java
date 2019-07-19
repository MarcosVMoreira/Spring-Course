package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class TennisCoach implements Coach{

	/*
	 * 
	 * for Field Injection with autowired, we just need to add the annotation
	 * @Autowired above the field definition. Spring use Java tecnology called Reflection
	 * to inject the value on the field, even it's a private field
	 * */
	 @Autowired
	 @Qualifier("badFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach () {
		System.out.println("TennisCoach: Inside default constructor.");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: inside of doMyStartupStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach: inside of doMyCleanupStuff()");
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
		
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
		
	}
	
}
