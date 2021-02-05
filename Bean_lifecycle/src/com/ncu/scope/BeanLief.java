package com.ncu.scope;



public class BeanLief implements Coach{
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
	public void doMyStartupStuff() {
		System.out.println("init method call");
	}
	public void doMyCleanupStuff() {
		System.out.println("Destroy method call");
	}

}
