package com.ncu.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("constructorspring.xml");
	Coach coach=(Coach)context.getBean("ccoach");
	Coach coach1=(Coach)context.getBean("ccoach1");
	System.out.println(coach.getDailyWorkout());
	System.out.println(coach.getDailyFortune());
	System.out.println(coach.getName());
	System.out.println(coach.toString());
	
	System.out.println("calling constructor injection");
	
	System.out.println(coach1.getDailyWorkout());
	System.out.println(coach1.getDailyFortune());
	System.out.println(coach1.getName());
	System.out.println(coach1.toString());
//	System.out.println(coach1.getDailyFortune());
	}

}
