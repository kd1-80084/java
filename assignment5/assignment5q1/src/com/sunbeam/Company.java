package com.sunbeam;

public class Company {

	public static void main(String[] args) {
	
		Employee employee;
//		Employee employee= new SalariedEmployee();
//		employee.acceptData();
//		employee.calculateTotalSalary();
//		System.out.println(employee);       //System.out.println(employee.toString());
		
		employee =new CommisionEmployee();
		employee.acceptData();
		employee.calculateTotalSalary();
		System.out.println(employee.toString());
		
		
		
	}

}
