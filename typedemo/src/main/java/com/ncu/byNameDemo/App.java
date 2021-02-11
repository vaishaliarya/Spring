package com.ncu.byNameDemo;

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
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
        Driver drive=(Driver)context.getBean("driver_name");
        System.out.println(drive.toString());
    
    }
}
