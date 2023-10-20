package com.sunbeam;

import java.util.Scanner;

public class ProgramMain {

	static void calculate(double num1, double num2, Arithmetic op) { 
	    double result = op.calc(num1, num2); 
	    System.out.println("Result: "+result); 
	}

	public static void main(String[] args) {		
		int choice;
		int num11,num21;
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("********************");
			System.out.println("0.exit");
			System.out.println("1.addition");
			System.out.println("2.subtraction");
			System.out.println("3.multiplicatin");
			System.out.println("4.division");
			System.out.print("enter your choice:: ");
			choice=sc.nextInt();
			System.out.println("********************");
			
			switch (choice) {
				case 1://addition
				{
					System.out.print("enter ist number:: ");
					num11=sc.nextInt();
					System.out.print("enter 2nd number:: ");
					num21=sc.nextInt();
					calculate(num11, num21, (x,y)->x+y);
				}
					
					break;
				case 2://subtraction
				{
					System.out.print("enter ist number:: ");
					num11=sc.nextInt();
					System.out.print("enter 2nd number:: ");
					num21=sc.nextInt();
					calculate(num11, num21, (x,y)->x-y);
				}
					
					break;
				case 3://multiplication
				{
					System.out.print("enter ist number:: ");
					num11=sc.nextInt();
					System.out.print("enter 2nd number:: ");
					num21=sc.nextInt();
					calculate(num11, num21, (x,y)->x*y);
				}
					
					break;
				case 4://division
				{
					System.out.print("enter ist number:: ");
					num11=sc.nextInt();
					System.out.print("enter 2nd number:: ");
					num21=sc.nextInt();
					calculate(num11, num21, (x,y)->x/y);
				}
					break;
	
				default:
					System.out.println("enter valid choice......:(");
					break;
			}
			
		}while(choice!=0);
	}

}

