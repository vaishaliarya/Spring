package firstIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// load the spring configuration file
				ApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
						
				// retrieve bean from spring container
				Coach theCoach = (Coach)context.getBean("myCoach", Coach.class);
				
				// call methods on the bean
				System.out.println(theCoach.getDailyWorkout());
				
				// let's call our new method for fortunes
//				System.out.println(theCoach.getDailyFortune());
				
				// close the context
				//context.close();

}
}
