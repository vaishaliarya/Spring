package com.ncu.constructor;

public class Address {
private String city;
private String house_no;
private String state;
private String pincode;


@Override
public String toString() {
	return "Address [city=" + city + ", house_no=" + house_no + ", state=" + state + ", pincode=" + pincode + "]";
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getHouse_no() {
	return house_no;
}
public void setHouse_no(String house_no) {
	this.house_no = house_no;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}

}
