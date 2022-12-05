package com.greatlearning.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String emailid;
	private String passwd; 
	
public Employee() {
		super();
	}
	
public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmailid() {
	return emailid;
}

public void setEmailid(String emailid) {
	this.emailid = emailid;
}

public String getPasswd() {
	return passwd;
}


public void setPasswd(String passwd) {
	this.passwd = passwd;
}

public Employee(String firstName,String lastName)
{
	this.firstName = firstName;
	this.lastName  = lastName;
}

@Override
public String toString() {
	String message;
	message = "\nDear "+ getFirstName()+" your  credentials generated are as follows\n";
	return message+"\nEmployee Details\n----------------\nFirst Name : " + getFirstName() + " \nLast Name  : " + getLastName() + "\nEmailId    : "
			+ getEmailid() + "\nPassword   : " + getPasswd() + "";
}
}


