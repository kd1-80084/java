package com.app.geometry;

import java.lang.Math;

public class point2D {
	private double x_axis;
	private double y_axis;

	public point2D() {

	}

	public point2D(double x_axis, double y_axis) {
		super();
		this.x_axis = x_axis;
		this.y_axis = y_axis;
	}

	public double getX_axis() {
		return x_axis;
	}

	public double getY_axis() {
		return y_axis;
	}

	public void setX_axis(double x_axis) {
		this.x_axis = x_axis;
	}

	public void setY_axis(double y_axis) {
		this.y_axis = y_axis;
	}

//	public String getDetails() {
//		return;
//	}

	boolean isEqual(point2D p2)
	{
		boolean flag =false;
		if(this.x_axis == p2.x_axis && this.y_axis == p2.x_axis);
		{
			System.out.println("two points are equal");
			flag=true;
		}
		else
		{
			System.out.println("two points are not equal");
		}
		
		return flag;
	}
	
	void getDetails() {
		System.out.println("point("+this.x_axis+","+this.y_axis+")");
		
	}
	
	double displayDistance(point2D p2) {
		double x=this.x_axis-p2.x_axis;
		double y=this.y_axis-p2.y_axis;
		return Math.sqrt(Math.pow(x,2)+(Math.pow(y,2)));
		
	}
}
