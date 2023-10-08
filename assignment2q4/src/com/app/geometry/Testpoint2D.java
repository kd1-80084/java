package com.app.geometry;

public class Testpoint2D {

	public static void main(String[] args) {
		
		double distance;
		boolean flag;
		point2D p1 = new point2D(3, 2);
		p1.getDetails();

		point2D p = new point2D(2, 5);
		point2D p2 = new point2D(3, 7);
		flag=p1.isEqual(p2);
		
		distance = p.displayDistance(p2);
		System.out.println("Distance:: " + distance);
		
	}

}
