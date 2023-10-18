package com.sunbeam;

import java.util.Scanner;

public class CommisionEmployee extends Employee {
	private double grossSale;
	private double commisionRate;

	public CommisionEmployee() {
		super();
	}

	

	public CommisionEmployee(String firstName, String lastName, int socialSecurityNo, double grossSale,
			double commisionRate) {

		super(firstName, lastName, socialSecurityNo);
		this.grossSale = grossSale;
		this.commisionRate = commisionRate;
	}



	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER GROSS SALE:: ");
		this.grossSale = sc.nextDouble();

		System.out.print("ENTER COMMISION RATE:: ");
		this.commisionRate = sc.nextInt();
	}

	@Override
	public String toString() {
		return "CommisionEmployeed [grossSale=" + grossSale + ", commisionRate=" + commisionRate + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public double calculateTotalSalary() {
		double totalSalary;
		totalSalary = this.grossSale * (this.commisionRate / 100);
		return totalSalary;
	}

}


