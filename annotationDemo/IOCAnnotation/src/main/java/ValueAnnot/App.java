package ValueAnnot;

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
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring2.xml");
    	CricketCoach cricket=(CricketCoach)ac.getBean("ccoach",CricketCoach.class);
    	
    	System.out.println(cricket.getDailyWorkout());
    	System.out.println(cricket.getName());
    	
    	
    	
//    
    	
    }
}
