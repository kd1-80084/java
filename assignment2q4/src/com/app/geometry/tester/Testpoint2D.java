package com.app.geometry.tester;


import com.app.geometry.point2D;

public class Testpoint2D {

	public static void main(String[] args) {

		double distance;
		String str;
		point2D p1 = new point2D();
		p1.acceptData();
		str=p1.getDetails();
		System.out.println(str);
		
		point2D p = new point2D();
		
		p.acceptData();
		point2D p2 = new point2D();
		p2.acceptData();
		
		if (p.isEqual(p2)) 
		System.out.println("two points are equal");
		 else {
		System.out.println("two points are not equal");
		}

		distance = p.displayDistance(p2);
		System.out.println("Distance:: " + distance);

	}

}


