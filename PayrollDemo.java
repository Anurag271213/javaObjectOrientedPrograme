package com.payroll_system.elc;

import java.util.Scanner;

import com.payroll_system.blc.Employee;
import com.payroll_system.blc.TaxUtil;

public class PayrollDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    System.out.println("Enter emp id:");
	    int employeeId = Integer.parseInt(sc.next());
	    
	    System.out.println("Enter employeeName:");
	    String employeeName= sc.next();
	    
	    System.out.println("Enter basicSalary:");
	    double basicSalary = Double.parseDouble(sc.next());
	    
	    System.out.println("Enter HRAPer:");
	    double HRAPer = Double.parseDouble(sc.next());
	    
	    System.out.println("Enter DAPer:");
	    double DAPer = Double.parseDouble(sc.next());
	    
	    Employee e1 = new Employee(employeeId,employeeName,basicSalary,HRAPer,DAPer);
	    	    
	    TaxUtil t1 = new TaxUtil();
	    System.out.println("Employee ko tax: "+t1.calculateTax(e1));
	    sc.close();



	    

	    
	}
    
    
	

    
    
	

}
