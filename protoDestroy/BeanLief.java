package com.ncu.protoDestroy;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Scope("prototype")
@Component("beanlife")
public class BeanLief implements Coach,DisposableBean {
	
	
	@Autowired
	private IFortune ifortune;
	
	public BeanLief() {
		System.out.println("in constructor");
	}
	
	@Override	
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice 30 hrs daily";
	}

	public IFortune getIfortune() {
		return ifortune;
	}

	public void setIfortune(IFortune ifortune) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.ifortune = ifortune;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}
	@PostConstruct 
	public void doMyStartupStuff() {
		System.out.println("init method call");
	}
	
	
//	public void doMyCleanupStuff() {
//		System.out.println("Destroy method call");
//	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("beanlief destroy");
		
	}

	
	
}
