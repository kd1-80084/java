package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	
	private String name;
	private String colour;
	private double weight;
	private boolean isfresh;
	
	public Fruit() {
	
	}

	public Fruit(String name, String colour, double weight, boolean isfresh) {
		this.name = name;
		this.colour = colour;
		this.weight = weight;
		this.isfresh = isfresh;
	}
	
	public void Accept() {
		int choice;
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER NAME:: ");
		name = sc.next();
		System.out.print("ENTER COLOUR:: ");
		colour = sc.next();
		System.out.print("ENTER WEIGHT:: ");
		weight = sc.nextDouble();
		System.out.println("ENTER FRUIT IS FRESH OR STALE:: ");
		System.out.println("ENTER 1.FOR FRESH FRUIT");
		System.out.println("ENTER 2.FOR STALE FRUIT");
		choice=sc.nextInt();
		if(choice==1)
			this.isfresh=true;
		else if(choice==2)
			this.isfresh=false;
		else
			System.out.println("ENTER VALID CHOICE");
			
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", colour=" + colour + ", weight=" + weight + ", isfresh=" + isfresh + "]";
	}
	
	public String test() {
		String test = "NOT SPECIFIC TEST";
		return test;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isIsfresh() {
		return isfresh;
	}

	public void setIsfresh(boolean isfresh) {
		this.isfresh = isfresh;
	}

	
	
	
	
}
