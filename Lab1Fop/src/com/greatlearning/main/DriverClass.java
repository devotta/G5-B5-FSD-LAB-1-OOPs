package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.interfaces.Credentials;
import com.greatlearning.services.*;

import com.greatlearning.model.Employee;

public class DriverClass {

    public static void displayMenu()
    {
    	//List of options
    	System.out.println("1. Technical");
    	System.out.println("2. Admin");
    	System.out.println("3. Human Resource");
    	System.out.println("4. Legal");
    }
	
	public static void main(String[] args) {
		
		//Create an object
		Employee emp = new Employee("Antony","Roy");
		int choice;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Please enter the department from the following");
		//display menu
		displayMenu();
		do
		{
			 
				choice = sc.nextInt();
				if ((choice<=0)||(choice>4)) {
					System.out.print("Please enter again the department from the following");
					
				}
			
			
		} while((choice<=0) || (choice>4));
		String dept="";
    	
    		
	    	//set the dept name based on users choice
			switch(choice)
	    	{
	    	 case 1:
	            dept = "tech";
	            break;
	          case 2:
	            dept = "admin";
	            break;
	          case 3:
	            dept = "hr";
	            break;
	          case 4:
	            dept = "legal";
	            break;
    	}
	
	
	String fname,lname,emailid,pwd;
	
    //Create an object on Credential services
	CredentialServices cs = new CredentialServices();
	
    //get the first & last name from the object
    fname = emp.getFirstName();
    lname = emp.getLastName();
    
    //Generate emailid and setit to employee
	emailid=cs.generateEmailAddress(fname,lname,dept);	
	emp.setEmailid(emailid);
	
	//Generate password and set it to the employee
	pwd=cs.generatePassword();
	emp.setPasswd(pwd);
	
	//Show the employee details along with credentials
    cs.showCredentials(emp);

	}

}
