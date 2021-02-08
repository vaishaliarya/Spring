package collections_injection;

import java.util.*;

public class Customer {
private List<String> names=new Vector<String>();
private Set<Long> Phno;
private Map<Long, String> aadharNo;
private Map<Long, Address> address;
private Properties email;
//public Customer(List<String> names,Set<Long> Phno,Map<Long, String> aadharNo,Properties email) {
//this.names=names;
//this.Phno=Phno;
//this.aadharNo=aadharNo;
//this.setEmail(email);
//}



public List<String> getNames() {
	return names;
}

@Override
public String toString() {
	return "Customer [names=" + names + ", Phno=" + Phno + ", aadharNo=" + aadharNo + ", address=" + address
			+ ", email=" + email + "]";
}

public void setNames(List<String> names) {
	this.names = names;
}
public Set<Long> getPhno() {
	return Phno;
}
public void setPhno(Set<Long> phno) {
	Phno = phno;
}
public Map<Long, String> getAadharNo() {
	return aadharNo;
}
public void setAadharNo(Map<Long, String> aadharNo) {
	this.aadharNo = aadharNo;
}


public Properties getEmail() {
	return email;
}


public void setEmail(Properties email) {
	this.email = email;
}
public Map<Long, Address> getAddress() {
	return address;
}
public void setAddress(Map<Long, Address> address) {
	this.address = address;
}


}





