package com.ncu.ConstructorbyType;



public class Driver {
private String Driver_name;
private License details;
private Address add;

public Driver(License details,Address add) {
	this.details=details;
	this.add=add;
}


@Override
public String toString() {
	return "Driver [Driver_name=" + Driver_name + ", details=" + details + ", add=" + add + "]";
}






public String getDriver_name() {
	return Driver_name;
}

public void setDriver_name(String driver_name) {
	Driver_name = driver_name;
}


public Address getAdd() {
	return add;
}


public void setAdd(Address add) {
	this.add = add;
}


}
