//Q2. Create a class called Employee that includes three fields—a first name (type String), a last
//name (type String) and a monthly salary (double). Provide a constructor that initializes the three
//instance variables. Provide a set and a get method for each instance variable. If the monthly salary
//is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
//class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.

package com.sunbeam.info.employee;

import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private Double salary;

	public Employee(String firstName, String lastName, Double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
	public void acceptData() {
		Scanner obj = new Scanner(System.in);
		System.out.println("ENTER FIRSTNAME:: ");
		this.firstName = obj.nextLine();
		System.out.println("ENTER LASTNAME:: ");
		this.lastName = obj.nextLine();
		System.out.println("ENTER SALARY:: ");
		this.salary = obj.nextDouble();
		if (salary < 0) {
			this.salary = 0.0;
		}
	}
	
	public void displayData() {
		System.out.println("FIRST NAME:: "+firstName);
		System.out.println("LASTST NAME:: "+lastName);
		System.out.println("SALARY:: "+salary);
	}
	

	public void salaryIncreament(double increament) {
		
		this.salary=salary+ (salary*increament)/100;
	}

	
	
}
























































