package com.sunbeam;

import java.util.Scanner;

public class BaseSalariedEmployee extends Employee {
	private double grossSale;
	private double commisionRate;
	private double Basesalary;
	
	BaseSalariedEmployee()
	{
		super();
	}
	
	BaseSalariedEmployee(String firstName,String laststName, int socialSecurityNo,double grossSale,
			double commisionRate, double Basesalary)
	{
		super(firstName,laststName,socialSecurityNo);
		this.grossSale=grossSale;
		this.commisionRate=commisionRate;
		this.Basesalary=Basesalary;
	}
	
	public void acceptData() {
		Scanner sc=new Scanner(System.in);
		super.acceptData();
		System.out.print("ENTER GROSS SALES ");
		this.grossSale=sc.nextDouble();
		System.out.print("ENTER GROSS COMMISION ");
		this.grossSale=sc.nextDouble();
		System.out.print("ENTER BASIC SALARY ");
		this.grossSale=sc.nextDouble();
	}
	
	@Override
	public String toString() {
		return "BaseSalariedEmployee [grossSale=" + grossSale + ", commisionRate=" + commisionRate + ", Basesalary="
				+ Basesalary + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void calculateTotalSalary() {
		double totalSalary;
		double rewardCommision=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER REWARD COMMISION PERCENTAGE:: ");
		rewardCommision= sc.nextDouble();
		
		if(rewardCommision!=0)
		{
			totalSalary=this.Basesalary+(this.grossSale*this.commisionRate/100)+(this.Basesalary*rewardCommision/100);
		}
		else
		{
			totalSalary=this.Basesalary+(this.grossSale*this.commisionRate/100);
			System.out.println("TOTAL SALARY:: " +totalSalary);	
		}
		
	}
	
	
	

}
