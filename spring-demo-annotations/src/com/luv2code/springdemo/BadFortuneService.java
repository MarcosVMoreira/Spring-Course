package com.luv2code.springdemo;

import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {
	
	
	@Value("${foo.firstFortune}")
	private String firstFortune;
	
	@Value("${foo.secondFortune}")
	private String secondFortune;
	
	private String[] data;
	
	@PostConstruct
	public void setupMyData() {
		
		data = new String[2];
		
		data[0] = firstFortune;
		data[1] = secondFortune;
		
	}

	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {

		int index = myRandom.nextInt(data.length);
		
		System.out.println("Data index "+data[index]);
		
		return data[index];
	}
	
	@PostConstruct
	private void printDataFromFile() {
		//System.out.println("Post construct: "+firstFortune+", "+secondFortune);
	}

}
