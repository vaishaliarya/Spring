package com.ncu.annotationDemo.IOCAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hcoach")
public class HockeyCoach implements Coach {

	@Autowired
	@Qualifier("restFortune")
	private IFortune ifortune;
	
	@Autowired
	@Qualifier("happyFortune")
	private IFortune ifortune1;
	

@Override
public String getDailyWorkout() {
	// TODO Auto-generated method stub
	return "Autowiring without constructor and setter methods";
}

@Override
public String getDailyFortune() {
	// TODO Auto-generated method stub
	return ifortune.getFortune();
	
}

public String getDailyFortune1() {
	// TODO Auto-generated method stub
	return ifortune1.getFortune();
	
}
}
