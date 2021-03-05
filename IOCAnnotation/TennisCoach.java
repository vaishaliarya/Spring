package com.ncu.annotationDemo.IOCAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tcoach")
public class TennisCoach {
	
	private IFortune ifortune;
	public TennisCoach() {
		System.out.println(">> TennisCoach: inside default constructor");
	}
	
	public IFortune getIfortune() {
		return ifortune;
	}
	
	@Autowired//injection using method-Autowiring
	@Qualifier("happyFortune")
	public void setIfortune(IFortune ifortune) {
		System.out.println(">>TennisCoach:inside setFortuneService() method");
		this.ifortune=ifortune;
	}
	
	public String getDailyWorkout() {
		return "do strecthing today";
	}
	
	
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}


}
