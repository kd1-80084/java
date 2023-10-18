package com.sunbeam;

//import org.w3c.dom.css.CSSValue;

class Box<Type extends Employee> {
	private Type obj;

	public void set(Type obj) {
		this.obj = obj;
	}

	public Type get() {
		return this.obj;
	}

	public void accept() {
		obj.acceptData();
	}

	public double getTotalsalary() {
		return obj.calculateTotalSalary();
	}
}



public class program01 {

	public static void main(String[] args) {
		SalariedEmployee s = new SalariedEmployee("krishna","gattewar",512,2000,50);
		Box<SalariedEmployee> b1 ;//refrance
		b1= new Box<>();
		b1.set(s);

	
		System.out.println(b1.get());
		System.out.println(b1.getTotalsalary());
	}

}
