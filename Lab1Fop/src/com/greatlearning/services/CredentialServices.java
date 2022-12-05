package com.greatlearning.services;

import java.util.Random;

import com.greatlearning.interfaces.Credentials;
import com.greatlearning.model.Employee;

public class CredentialServices implements Credentials {

	@Override
	public String generateEmailAddress(String firstName, String lastName, String dept) {
		// TODO Auto-generated method stub
		String emailid ;
		emailid= firstName.toLowerCase()+lastName.toLowerCase();
		emailid = emailid+"@"+dept+".greatlearning.com";
		
		return emailid;
		
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		//return "test";
		String uCaps   = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lCaps   = "abcdefghijklmnopqrstuvwxyz";
		String nos     = "0123456789";
		String spChars = "!@#$%^&*";
		
		StringBuffer passwd = new StringBuffer();
		Random random = new Random();
		int rand;
		
		//Select random upper case letters
		rand = random.nextInt(uCaps.length());
		passwd.append(uCaps.charAt(rand));
		
		//Select random lower case letters
		rand = random.nextInt(lCaps.length());
		passwd.append(lCaps.charAt(rand));
		
		//Select random number
		rand = random.nextInt(nos.length());
		passwd.append(nos.charAt(rand));
		
		//Special Char
		rand = random.nextInt(spChars.length());
		passwd.append(spChars.charAt(rand));
		
		//Additional 4 characters
		for(int i=1;i<=4;i++)
		{
			switch (i)
			{
			case 1: rand = random.nextInt(uCaps.length());
					passwd.append(uCaps.charAt(rand));
					break;
					
			case 2: rand = random.nextInt(lCaps.length());
					passwd.append(lCaps.charAt(rand));
					break;
					
			case 3: rand = random.nextInt(nos.length());
					passwd.append(nos.charAt(rand));
					break;
					
			case 4: rand = random.nextInt(spChars.length());
					passwd.append(spChars.charAt(rand));
					break;
					
			}
		}
		
		return passwd.toString();
	}

	@Override
	public void showCredentials(Employee emp) {
		System.out.println(emp.toString());
		

	}

}
