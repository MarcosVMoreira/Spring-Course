package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("singleton")
public class TennisCoach implements Coach{

	/*
	 * 
	 * for Field Injection with autowired, we just need to add the annotation
	 * @Autowired above the field definition. Spring use Java tecnology called Reflection
	 * to inject the value on the field, even it's a private field
	 * */
	 @Autowired
	 @Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	 *constructor injection with autowired
	 * @Autowired
	public TennisCoach (FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	public TennisCoach () {
		System.out.println("TennisCoach: Inside default constructor.");
	}
	
	/*@Autowired
	 * 
	 * setter injection with autowired
	public void setTennisCoach (FortuneService fortuneService) {
		System.out.println("TennisCoach: Inside setter method.");
		this.fortuneService = fortuneService;
	}
	
	@Autowired
	public void doSomeCrazyStuff (FortuneService fortuneService) {
		System.out.println("TennisCoach: Inside doSomeCrazyStuff method. "+fortuneService.getFortune());
		this.fortuneService = fortuneService;
	}	
	
	@Autowired
	public void testingTwoMethodsWithAutowired (FortuneService fortuneService) {
		System.out.println("TennisCoach: Inside testingTwoMethodsWithAutowired method. "+fortuneService.getFortune());
		this.fortuneService = fortuneService;
	}*/
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
		
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortune();
		
	}
	
}
