package com.ncu.noType;



public class Driver {
private String Driver_name;

private Address add;


public Driver(Address add) {
	
	this.add=add;
}


@Override
public String toString() {
	return "Driver [Driver_name=" + Driver_name + ",add=" + add + "]";
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
