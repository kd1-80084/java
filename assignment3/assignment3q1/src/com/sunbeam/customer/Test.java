
package com.sunbeam.customer;


import java.util.Scanner;

class CreditCalculator
{
	int accno;
	int balance;
	int chargeditems;
	int totalcredits;
	int creditlimit;
	public CreditCalculator() {
	}
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter account no = ");
		accno=sc.nextInt();
		System.out.print("Enter account balance = ");
		balance=sc.nextInt();
		System.out.print("Enter total items charged = ");
		chargeditems=sc.nextInt();
		System.out.print("Enter total credits applied = ");
		totalcredits=sc.nextInt();
		System.out.print("Enter credit limit = ");
		creditlimit=sc.nextInt();
	}
	public int calculate()
	{
		int balance;
		balance=this.balance+this.chargeditems-this.totalcredits;
		return balance;
	}
	
	public void display()
	{
		if(calculate()>this.creditlimit)
		{
			System.out.println("Credit limit exceeded");
				
		}
		else
			System.out.println("New Balance= "+calculate());
		
	}
	
	
}
public class Test {

	public static void main(String[] args) {
		CreditCalculator cc=new CreditCalculator();
		cc.accept();
		cc.calculate();
		cc.display();

	}

}