package com.greatlearning.services;
import com.greatlearning.model.Employee;

import com.greatlearning.interfaces.Credentials;

public class CredentialServices implements Credentials{

	public String generatePassword()
	{
		String pwd = "Testing123@12";
		//will be implementing
		return pwd;
	}
	
	public String generateEmailAddress(String firstName,String lastName,String dept)
	{
		String emailid;
		emailid =firstName+lastName+"@"+dept+"greatlearning.com";
		
		
		return emailid;
		
	}
	
	public void showCredentials(Employee emp)
	{
		System.out.println(emp);
	}
	
}
