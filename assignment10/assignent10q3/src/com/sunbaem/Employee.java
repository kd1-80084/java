package com.sunbaem;

import java.util.Objects;
import java.util.Scanner;

public class Employee {
	private  int empid;
	private String empname;
	private Double salary;
	
	public Employee(int empid, String empname, Double salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}

	public Employee() {
		
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + this.empid + ", empname=" + this.empname + ", salary=" + this.salary + "]";
	}
	
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter empid:: ");
		this.empid=sc.nextInt();
		sc.nextLine();
		System.out.print("enter empname:: ");
		this.empname=sc.nextLine();
		System.out.print("enter slary:: ");
		this.salary=sc.nextDouble();
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid;
	}
	
	
	
	
	

}
