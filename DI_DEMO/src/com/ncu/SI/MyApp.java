package com.ncu.SI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Coach coach=(Coach)context.getBean("myCCoach");
//	Coach coach1=(Coach)context.getBean("myBCoach");
	System.out.println(coach.getDailyWorkout());
	System.out.println(coach.getDailyFortune());
//	System.out.println(coach1.getDailyFortune());
	}

}
