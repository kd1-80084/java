package com.sunbeam;

public class ProgramMain {

	public static void main(String[] args) {
		Emp[] arr = new Emp[3];
		arr[0]=new Manager(1000,500);
		arr[1]=new Cleark(500);
		arr[2]=new Labour(450,100);
		
		double totalincome;
		totalincome= Emp.calcTotalIncome(arr);
		System.out.println(totalincome);

	}
}
