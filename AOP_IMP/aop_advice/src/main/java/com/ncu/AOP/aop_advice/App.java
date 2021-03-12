package com.ncu.AOP.aop_advice;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(DemoConfig.class);
       AccountDao theAccountDAO = context.getBean("accountDao", AccountDao.class);
       Account acc=context.getBean("account",Account.class);
       List<Account> theAccounts = theAccountDAO.findAccounts();
       System.out.println("fininshed call of findacc");
       System.out.println("\n\nMain Program: AfterReturningDemoApp");
		System.out.println("----");
		
		System.out.println(theAccounts);
		
		System.out.println("\n");
       
       acc.setName("vaishali");
       System.out.println(acc.getName());
       context.close();
    }
}
