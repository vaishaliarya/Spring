package com.ncu.LoggerDemo;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {
	Logger logger = Logger.getLogger(LoggerAspect.class);
	
	long starttime,endtime;
	//pointcut declaration for the method print with predicate implementation
	@Pointcut("execution(* p*())")
	public void myPointCut() {}
	
	
	//apply the advice before aspect on the print method
	@Before("myPointCut()")
	public void start(JoinPoint jp) {
		logger.debug("Going to start "+jp.getSignature());
		System.out.println("Start Call "+jp.getSignature());
		System.out.println("Method Name: "+jp.getStaticPart().getSignature().getName());
		starttime=System.currentTimeMillis();
		logger.debug("starttime: "+starttime);
	}
	//apply the advice after aspect on the print method
	@After("myPointCut()")
	public void end(JoinPoint jp) {
		logger.debug("Going to endtime "+jp.getSignature());
		
		endtime=System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endtime-starttime)+"ms");
	}
	
	@AfterReturning(pointcut = "myPointCut()" ,returning = "result")
	public void returnAdvice(String result) {
		System.out.println("After Return Result is "+result);
	}
	
}
