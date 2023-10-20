package com.sunbeam;

public class Labour implements Emp {
	private int workinghours;
	private int Rate;

	Labour() {

	}

	public Labour(int workinghours, int rate) {
		super();
		this.workinghours = workinghours;
		Rate = rate;
	}

	public int getWorkinghours() {
		return workinghours;
	}

	public void setWorkinghours(int workinghours) {
		this.workinghours = workinghours;
	}

	public int getRate() {
		return Rate;
	}

	public void setRate(int rate) {
		Rate = rate;
	}

	@Override
	public String toString() {
		return "Labour [workinghours=" + workinghours + ", Rate=" + Rate + "]";
	}

	@Override
	public double getSal() {
		double totalsalary = (double) (this.workinghours * this.Rate);
		return totalsalary;
	}

	public double calcIncentives() {
		
		if (this.workinghours > 300)
			return (0.05 *this.getSal());
		else
		return 0;
	}
}
