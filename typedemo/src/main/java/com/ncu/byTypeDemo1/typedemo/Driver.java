package com.ncu.byTypeDemo1.typedemo;



public class Driver {
private String Driver_name;
private License license1;

@Override
public String toString() {
	return "Driver [Driver_name=" + Driver_name + ", license1=" + license1 + "]";
}


//public License getDetails() {
//	return details;
//}
//
//
//public void setDetails(License details) {
//	this.details = details;
//}
//

public String getDriver_name() {
	return Driver_name;
}

public void setDriver_name(String driver_name) {
	Driver_name = driver_name;
}


public License getLicense1() {
	return license1;
}


public void setLicense1(License license1) {
	this.license1 = license1;
}


}
