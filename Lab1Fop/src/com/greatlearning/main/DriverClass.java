package com.greatlearning.main;
import java.util.*;

import com.greatlearning.model.Employee;


public class DriverClass {

    
	public static void main(String[] args) {
	
    
        ///---
		
		// TODO Auto-generated method stub
		Employee emp = new Employee("Antony","Roy");
		int choice;
		
		emp.displayEmployeeDetails();
		Scanner sc = new Scanner(System.in);
		
		
		String dept;
		displayMenu();
			System.out.print("Please enter the department from the following");
			choice = sc.nextInt();
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
		
	//implementing 
        	        
		
	   
	}
	
	
    public static void displayMenu()
    {
    	System.out.println("Technical");

    	System.out.println("Admin");

    	System.out.println("Human Resource");

    	System.out.println("Legal");
    }

}
