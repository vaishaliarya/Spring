package com.ncu.AOP.AopDemo;

import org.springframework.stereotype.Component;

@Component("accountDao")
public class AccountDao {

	public void addAccount() {
		System.out.println("in account add");
	}
	
}
