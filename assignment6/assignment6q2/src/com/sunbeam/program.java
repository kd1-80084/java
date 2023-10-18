package com.sunbeam;

public class program {

	public static void main(String arr[]) {

		Circle c1 = new Circle();
		System.out.println(c1.toString());
		try {
			c1.acceptData();
		} catch (DiameterNegativeException e1) {
			e1.printStackTrace();
			System.out.println("inside catch block");
		}
		
		System.out.println("program complte successfully");
	}
	
}