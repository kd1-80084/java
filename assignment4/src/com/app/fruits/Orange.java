package com.app.fruits;

public class Orange extends Fruit {
	
	
	public Orange() {
		
	}

	public Orange(String name, String colour, double weight, boolean isfresh) {
		super(name, colour, weight, isfresh);
	}
	
	@Override
	public String test() {
		String test = "SOUR";
		return test;
	}

		
}
