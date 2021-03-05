package com.ncu.javaconfig;

public class CricketCoach implements Coach {

	private IFortune fortune;
	
	
	public CricketCoach(IFortune fortune) {
		this.fortune=fortune;
	}
	
	@Override
	public String getRoutine() {
		// TODO Auto-generated method stub
		return "do daily workout";
	}
	public String display() {
		return fortune.getFortune();
	}
	
	

}
