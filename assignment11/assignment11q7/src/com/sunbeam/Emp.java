package com.sunbeam;

public interface Emp {
	/*public abstract */double getSal();
	default double calcIncentives() {
		
		return 0.0;
	}
	
	
	static double calcTotalIncome(Emp[] arr)
	{
		double total=0;
		for(Emp e:arr)
			total=e.getSal()+e.calcIncentives();
		return total;
	}
	
}
