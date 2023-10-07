package com.sunbeam.info.employee;

public class Employeetest {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.acceptData();
		e1.displayData();
		e1.salaryIncreament(10);
		e1.displayData();
		System.out.println("YEARLY SALARY:: "+e1.getSalary()*12);
	}

}
