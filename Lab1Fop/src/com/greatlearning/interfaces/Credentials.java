package com.greatlearning.interfaces;
import com.greatlearning.model.Employee;

public interface Credentials {
	public String generateEmailAddress(String firstName,String lastName);
	public String generatePassword();
	public void showCredentials(Employee emp);
	
}
