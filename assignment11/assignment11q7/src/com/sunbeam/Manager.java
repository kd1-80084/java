package com.sunbeam;

public class Manager implements Emp {
	
	private  double basicsalary;
	private double deranceallowance;
	
	Manager(){
		
	}

	public double getBasicsalary() {
		return basicsalary;
	}

	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}

	public double getDeranceallowance() {
		return deranceallowance;
	}

	public void setDeranceallowance(double deranceallowance) {
		this.deranceallowance = deranceallowance;
	}

	public Manager(double basicsalary, double deranceallowance) {
		super();
		this.basicsalary = basicsalary;
		this.deranceallowance = deranceallowance;
	}
	
	@Override
	public double getSal() {
		Double totalsalary=this.basicsalary+this.deranceallowance;
		return totalsalary;
	}
	
	
	
	public double calcIncentives() {
		Double incentive= 0.20*this.basicsalary;
		return incentive;
	}
	

}
