package com.ncu.annotationDemo.IOCAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
    	CricketCoach cricket=(CricketCoach)ac.getBean("ccoach",CricketCoach.class);
    	
    	System.out.println(cricket.getDailyWorkout());
    	System.out.println(cricket.getDailyFortune());
TennisCoach tennis=(TennisCoach)ac.getBean("tcoach",TennisCoach.class);
    	
    	System.out.println(tennis.getDailyWorkout());
    	System.out.println(tennis.getDailyFortune());
    	
    	
    }
}
