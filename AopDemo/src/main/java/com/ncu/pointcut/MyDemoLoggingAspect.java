package com.ncu.pointcut;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	
	
	@Pointcut("execution(* addAccount(..))")//different place location where you want to apply the advice
	private void forDaopackage() {}
	
	@Before("forDaopackage()")//how i want to apply, that is my aspect
	public void beforeAddAccountAdvice() {//this is my advice which i want to apply
		
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		
	}
	
	@After("forDaopackage()&& expression()")
	public void beforeLogging() {
		
		System.out.println("\n=====>>> Executing @After on addAccount()");
		
	}
	
	
	}
