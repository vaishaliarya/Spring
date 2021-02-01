package com.ncu.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	Coach coach=(Coach)context.getBean("ccoach");
//	Coach coach1=(Coach)context.getBean("myBCoach");
	System.out.println(coach.getDailyWorkout());
	System.out.println(coach.getDailyFortune());
	System.out.println(coach.getName());
	System.out.println(coach.toString());
//	System.out.println(coach1.getDailyFortune());
	}

}
