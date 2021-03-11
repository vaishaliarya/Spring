package com.ncu.LoggerDemo;

import org.springframework.stereotype.Component;

@Component("accountDemo")
public class AccountDemo {
	public void print() {
		System.out.println("A Class Print");
	}
}
