package com.ncu.pointcut;

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
    			
    			// get the bean from spring container
    			AccountDao theAccountDao=context.getBean("accountDao",AccountDao.class);
    			
    			// call the business method
    			theAccountDao.addAccount();

    			// do it again!
    			System.out.println("\nlet's call it again!\n");
    			
    			// call the business method again
    			theAccountDao.addAccount();
    					
    			// close the context
    			context.close();
    }
}
