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
    	ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
    	CricketCoach cricket=(CricketCoach)ac.getBean("ccoach");
    	
    	System.out.println(cricket.getDailyWorkout());
    	System.out.println(cricket.getDailyFortune());
    	
//    	Implemented for setter injection
    	TennisCoach tennis=(TennisCoach)ac.getBean("tcoach",TennisCoach.class);
    	
    	System.out.println(tennis.getDailyWorkout());
    	System.out.println(tennis.getDailyFortune());
    	
//    	Implemented for injection without constructor/setter
    	System.out.println("In HockeyCoach implementation");
    	
    	HockeyCoach hockey=(HockeyCoach)ac.getBean("hcoach",HockeyCoach.class);
    	
    	System.out.println(hockey.getDailyWorkout());
    	System.out.println(hockey.getDailyFortune());
    	System.out.println(hockey.getDailyFortune1());
    	
    	
    }
}
