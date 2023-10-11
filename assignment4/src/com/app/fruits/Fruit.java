package com.app.fruits;

import java.util.Scanner;

public class Fruit {

	private String name;
	private String colour;
	private double weight;
	private boolean isfresh=true;

	public Fruit() {

	}

	public Fruit(String name, String colour, double weight, boolean isfresh) {
		this.name = name;
		this.colour = colour;
		this.weight = weight;
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
