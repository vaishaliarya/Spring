package PracticeExcercise;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeMainApp {
	 public static void main( String[] args )
	    {
	
	ApplicationContext context = 
			new ClassPathXmlApplicationContext("practiceEx.xml");
	
	// get the bean from spring container
	Coach theCoach = context.getBean("practiceActivity", Coach.class);
	
	// call a method on the bean
	System.out.println(theCoach.getDailyWorkout());
	System.out.println(theCoach.getDailyFortune());
}
}