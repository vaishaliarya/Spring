package com.ncu.AOP.aop_advice;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterReturningDemo {

	
	@AfterReturning(pointcut="execution(* com.ncu.AOP.aop_advice.AccountDao.findAccounts(..))",
			returning="result")	
	public void afterReturningFindAccountsAdvice(
			JoinPoint theJoinPoint, List<Account> result) {

		// print out which method we are advising on 
		String method = theJoinPoint.getSignature().getName();
		System.out.println("\n=====>>> Executing @AfterReturning on method: " + method);
				
		// print out the results of the method call
		System.out.println("\n=====>>> result is: " + result);
		}
//		
//	@Around("execution(* com.ncu.AOP.aop_advice.AccountDao.findAccounts(..))")
//	public void aroundaspect(ProceedingJoinPoint pt)throws Throwable {
//		System.out.println("Around advice");
////		 print out which method we are advising on 
//		System.out.println("****logAroundAllMethods() : " + pt.getSignature().getName() + ": Before Method Execution");
//        try {
//            pt.proceed();
//        } finally {
//         
////            System.out.println("\n=====>>> result is: " + result);
//        }
//        System.out.println("****LoggingAspect.logAroundAllMethods() :"+ pt.getSignature().getName() +" : After Method Execution");
//		
//		
//		
//	}
//	
//	@Around("execution(* com.ncu.AOP.aop_advice.AccountDao.findAccounts(..))")
//	public Object aroundaspect(ProceedingJoinPoint pt)throws Throwable {
//		 Object result;
//		System.out.println("Around advice");
////		 print out which method we are advising on 
//		System.out.println("****logAroundAllMethods() : " + pt.getSignature().getName() + ": Before Method Execution");
//        try {
//           result=pt.proceed();
//           System.out.println("\n=====>>> result is: " + result);
//        } finally {
//         
//            
//        }
//        System.out.println("****LoggingAspect.logAroundAllMethods() :"+ pt.getSignature().getName() +" : After Method Execution");
//		
//		return result;
//		
//	}
//	@Around("execution(* com.ncu.AOP.aop_advice.AccountDao.findAccounts(..))")
//	public Object aroundaspect(ProceedingJoinPoint pt)throws Throwable {
//		 Object result;
//		 long begin = System.currentTimeMillis();
//		System.out.println("Around advice");
////		 print out which method we are advising on 
//		System.out.println("****logAroundAllMethods() : " 
//+ pt.getSignature().getName() + ": Before Method Execution");
//        try {
//           result=pt.proceed();
//           System.out.println("\n=====>>> result is: " + result);
//        } finally {
//        	long end = System.currentTimeMillis();
//        	long duration = end - begin;
//    		System.out.println("\n=====> Duration: " 
//        	+ duration / 1000.0 + " seconds");
//        }
//        System.out.println("****LoggingAspect.logAroundAllMethods() :"
//        + pt.getSignature().getName() +" : After Method Execution");
//		
//		return result;
//		
//	}
//	
}