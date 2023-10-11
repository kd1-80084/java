package com.app.fruits;

public class Apple extends Fruit {

	

	public Apple() {
		
	}

	public Apple(String name, String colour, double weight, boolean isfresh) {
		super(name, colour, weight, isfresh);
	}

	@Override
	public String test() {
		String test = "SWEET AND SOUR";
		return test;
	}

}
