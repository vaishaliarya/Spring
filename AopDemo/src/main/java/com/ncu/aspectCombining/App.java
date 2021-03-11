package com.ncu.aspectCombining;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// read spring config java class
    			AnnotationConfigApplicationContext context =
    					new AnnotationConfigApplicationContext(DemoConfig.class);
    			System.out.println("---before main call----");
    			// get the bean from spring container
    			AccountDao theAccountDao=context.getBean("accountDao",AccountDao.class);
    	
    			// call the business method
    			theAccountDao.getAccountDao().setAccountName("vaishali");
    			
    			//call the setter method
//    			theAccountDao.setAccountName("vaishali");
//    			theAccountDao.setAccountName("vaishali");
//    			call the getter method
    			System.out.println(theAccountDao.getAccountName());

    			
    			context.close();
    }
}
