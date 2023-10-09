package com.app.geometry;

import java.util.Scanner;

public class Point2D {

	private double x_axis;
	private double y_axis;

	public Point2D() {
		this(10, 10);
	}

	public Point2D(double x_axis, double y_axis) {
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

	public String getDetails() {
		String a = "X-axis :- " + this.x_axis + " " + "Y-axis :- " + y_axis;
		return a;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER X_COORDINATE OF POINT:: ");
		x_axis = sc.nextDouble();
		System.out.print("ENTER Y_COORDINATE OF POINT:: ");
		y_axis = sc.nextDouble();
	}

	public boolean isEqual(Point2D p2) {
		boolean flag = false;
		if (this.x_axis == p2.x_axis && this.y_axis == p2.x_axis)
			flag = true;

		return flag;
	}

	public void getDisplay() {
		System.out.println("point(" + this.x_axis + "," + this.y_axis + ")");
	}

	public double displayDistance(Point2D p2) {
		double x = this.x_axis - p2.x_axis;
		double y = this.y_axis - p2.y_axis;
		return Math.sqrt(Math.pow(x, 2) + (Math.pow(y, 2)));

	}

}
