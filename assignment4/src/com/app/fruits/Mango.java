package com.app.fruits;

public class Mango extends Fruit {
	
	public Mango() {
	
	}

	public Mango(String name, String colour, double weight, boolean isfresh) {
		super(name, colour, weight, isfresh);
	}

	@Override
	public String test() {
		String test = "SWEET";
		return test;
	}
	
}
