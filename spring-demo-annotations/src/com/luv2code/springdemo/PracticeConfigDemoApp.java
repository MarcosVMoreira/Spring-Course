package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config file (xml)
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(PracticeConfig.class);
		
		// get the bean from spring container
		PracticeCoach theCoach = context.getBean("practiceCoach", PracticeCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		// close the context
		context.close();
		
	}

}

