package com.sunbeam;

import java.util.Scanner;

abstract public class Employee {
	private String firstName ;
	private String lastName ;
	private int socialSecurityNo;
	
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, int socialSecurityNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNo = socialSecurityNo;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER FIRSTNAME:: ");
		firstName = sc.next();
		System.out.print("ENTER LASTNAME:: ");
		firstName = sc.next();
		System.out.print("ENTER SOCIAL SECURITY NO:: ");
		socialSecurityNo = sc.nextInt();	
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNo=" + socialSecurityNo+ "]";
	}
	
	
	abstract public double calculateTotalSalary();
}
