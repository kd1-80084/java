package com.sunbeam;

public class DiameterNegativeException extends Exception {
	private String name;
	private int value;
	
	
	public DiameterNegativeException() {
		
	}

	
	public DiameterNegativeException(String name, int value) {
		this.name = name;
		this.value = value;
	}


	@Override
	public String toString() {
		return "DiameterNegativeException [name=" + name + ", value=" + value + ", toString()=" + super.toString()
				+ "]";
	}


	
	
	
	
	
	
	
	
	

}
