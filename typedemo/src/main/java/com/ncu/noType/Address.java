package com.ncu.noType;


public class Address {
private String H_No;
private String city ;


@Override
public String toString() {
	return "Address [H_No=" + H_No + ", city=" + city + "]";
}
public String getH_No() {
	return H_No;
}
public void setH_No(String h_No) {
	H_No = h_No;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
}
