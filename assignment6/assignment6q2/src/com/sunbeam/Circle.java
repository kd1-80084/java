package com.sunbeam;

import java.util.Scanner;

public class Circle {
	private Point2D p1;
	private int diameter;
	
	
	public Circle() {
		this.p1=new Point2D(0,0);
		this.diameter=100;
	}


	public Circle(int x_axis,int Y_axis , int diameter) {
		this.p1 =new Point2D(x_axis,Y_axis);
		this.diameter = diameter;
	}


	void acceptData()throws DiameterNegativeException{
		this.p1.acceptData();
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the diameter:: ");
		this.diameter=sc.nextInt();
		if(this.diameter<=0)
		{
			
			throw new DiameterNegativeException("diametr should not be negative",this.diameter);
		}
		
	}


	@Override
	public String toString() {
		return "Circle [p1=" + p1 + ", diameter=" + diameter + "]";
	}


}
