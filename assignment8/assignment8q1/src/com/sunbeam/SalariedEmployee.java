package com.sunbeam;

import java.util.Scanner;

public class SalariedEmployee extends Employee {
	
	private double hourlyWages;
	private int workingHours;
	
	
	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(String firstName, String lastName, int socialSecurityNo) {
		super(firstName, lastName, socialSecurityNo);
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(String firstName, String lastName, int socialSecurityNo, double hourlyWages,
			int workingHours) {
		super(firstName, lastName, socialSecurityNo);
		this.hourlyWages = hourlyWages;
		this.workingHours = workingHours;
	}

	public void acceptData() {
		super.acceptData();
		Scanner sc=new Scanner (System.in);
		
		System.out.print("ENTER HOURLY SALARY:: ");
		this.hourlyWages=sc.nextDouble();
		
		System.out.print("ENTER TOTAL WORKING HOURS:: ");
		this.workingHours=sc.nextInt();	
	} 

	@Override
	public String toString() {
		return "SalariedEmployee [hourlyWages=" + hourlyWages + ", workingHours=" + workingHours + ", toString()="
				+ super.toString() + "]";
	}
	
	
	@Override
	public double calculateTotalSalary() {
		double totalSalary=0.0;
		if(this.workingHours<=40)
		{
			totalSalary=(this.hourlyWages*this.workingHours);
			return totalSalary;
		}
		else
		{
			totalSalary=((this.hourlyWages*40)+(1.5*this.hourlyWages*(this.workingHours-40)));
			return totalSalary;
		}

	}

}
