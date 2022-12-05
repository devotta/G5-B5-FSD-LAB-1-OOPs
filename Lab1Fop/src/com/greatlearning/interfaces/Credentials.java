package com.greatlearning.interfaces;
import com.greatlearning.main.*;
import com.greatlearning.model.Employee;

public interface Credentials {
	public String generateEmailAddress(String firstName,String lastName, String dept);
	public String generatePassword();
	public void showCredentials(Employee emp);
}
