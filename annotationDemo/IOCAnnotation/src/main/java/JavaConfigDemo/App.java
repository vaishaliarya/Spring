package JavaConfigDemo;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import JavaConfigDemo.CricketCoach;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigBean.class);
		ApplicationContext app=new ClassPathXmlApplicationContext("javaconfig.xml");
		// get the bean from spring container
		Coach theCoach = context.getBean("ccoach", Coach.class);//cricketcoch
		Coach hcoach=(Coach)app.getBean("hcoach",HockeyCoach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
				
		// call method to get the daily fortune
		System.out.println(theCoach.getDailyFortune());
					
		// close the context
	
		
		//calling the method from spring xml
		System.out.println("xml configuration called here---------");
		System.out.println(hcoach.getDailyWorkout());
		System.out.println(hcoach.getDailyFortune());

		//calling constructor of cricketcoach class
//		Scanner sc=new Scanner(System.in);
//    	System.out.println("enter your name");
//    	String name=sc.next();
    	CricketCoach thecoach1=(CricketCoach) context.getBean("coach","CricketCoach.class");
    System.out.println(thecoach1.getName());
}
}