package com.ncu.models;







import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	private String fname;
	
	@NotNull(message="is required")
	@Size(min=2, message="is required")
	private String lname;
	@NotNull(message="is required")
	@Pattern(regexp= "[0-9]{10}", message="Only 10 digits allowed")
	private String pno;
	@NotNull(message="is required")
	@Pattern(regexp= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="email required")
	private String email;
	private String country;
	
	
	
	
	public Customer() {
		
		
//		countryList = new ArrayList<String>();
//	    countryList.add( "United States");
//	    countryList.add("China");
//	    countryList.add("Singapore");
//	    countryList.add("Malaysia");
//	    System.out.println("List is"+countryList);
	}
	

	

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	}
