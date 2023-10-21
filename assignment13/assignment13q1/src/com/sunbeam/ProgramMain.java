package com.sunbeam;

import java.util.Scanner;

public class ProgramMain {
	
	public static void main(String[] args) {
		int choice=0;
		
		do {
			Scanner sc= new Scanner(System.in);
			System.out.println("**********************");
			System.out.println("0.exit");
			System.out.println("1.write into file");
			System.out.println("2.for read from file");
			System.out.print("enter your choice:: ");
			choice=sc.nextInt();
			
			switch (choice) {
				case 1:
					BookData.readBookFRomFile();
					break;
					
				case 2:
					BookData.readBookFRomFile();
					break;
	
				default:
					System.out.println("enter valid choice......:(");
					break;
			}
			
		}while(choice!=0);
		System.out.println("thaks for visiting.......");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
