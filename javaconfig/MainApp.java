package com.ncu.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(configApp.class);
		
	//get the bean
	Coach thecoch=context.getBean("cricketCoach",Coach.class);
	System.out.println(thecoch.getRoutine());
	
	CricketCoach coach=(CricketCoach)context.getBean("ccoach",CricketCoach.class);
	System.out.println(coach.display());
	
	}

}
