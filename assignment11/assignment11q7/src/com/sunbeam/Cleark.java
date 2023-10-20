package com.sunbeam;

public class Cleark  implements Emp{
	private double salary;
	
	Cleark(){
		
	}
	
	public Cleark(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getSal() {
		return this.salary;
	}
	
	

}
