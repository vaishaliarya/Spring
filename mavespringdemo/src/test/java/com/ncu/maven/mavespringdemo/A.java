package com.ncu.maven.mavespringdemo;

public class A {
private B b;

public A() {
	System.out.println("in constructor A");
}
public B getB() {
	return b;
}
public void setB(B b) {
	System.out.println("in B");
	this.b = b;
}

}
