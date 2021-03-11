package com.ncu.aspectCombining;






import java.util.ArrayList;
import java.util.Iterator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect{
	
@Pointcut("execution(* com.ncu.aspectCombining.AccountDao.set*(..))")
private void onSetter() {}
		
	@Pointcut("execution(* get*(..))")
	private void ongetter() {}
	
	@Pointcut("execution(* com.ncu.aspectCombining.AccountDao.*())")
	private void forDaopackage() {}
	
	@Before("(forDaopackage()&& onSetter())")
	public void beforeAddAccountAdvice(JoinPoint jp) {
		System.out.println("\n=====>>> Executing advice on and logical operator addAccount()");
		ArrayList<MethodSignature> ms= new ArrayList<MethodSignature>();
		ms.add((MethodSignature)jp.getSignature());
		Iterator<MethodSignature> itr=ms.iterator();//getting the Iterator  
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		  
	}
//	@Before("ongetter()")
//	public void AccountAdvice(JoinPoint jp) {
//		
//		System.out.println("\n=====>>> Executing advive on setter");
////		MethodSignature ms=(MethodSignature)jp.getSignature();
////		System.out.println("Method:"+ms);
//		ArrayList<MethodSignature> ms= new ArrayList<MethodSignature>();
//		ms.add((MethodSignature)jp.getSignature());
//		Iterator<MethodSignature> itr=ms.iterator();//getting the Iterator  
//		  while(itr.hasNext()) {
//			  System.out.println(itr.next());
//		  }
//		
//	}
//	
	
	}
