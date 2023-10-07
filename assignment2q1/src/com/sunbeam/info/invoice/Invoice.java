//Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
//sold at the store. An Invoice should include four pieces of information as fields—a part number
//(type String), a part description (type String), a quantity of the item being purchased (type int) and a
//price per item (double). Your class should have a constructor
//that initializes the four instance variables. Provide a set and a get method for each instance variable.
//calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
//amount as a double value.
//If the quantity is not positive, it should be set to 0.
//If the price per item is not positive, it should be set to 0.0.
//Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.

package com.sunbeam.info.invoice;

import java.util.Scanner;

public class Invoice {
	private String partNumber;
	private String partDiscription;
	private int quantity;
	Double price;

	public Invoice() {
		this.partNumber = " ";
		this.partDiscription = " ";
		this.quantity = 0;
		this.price = 0.0;
	}

	public Invoice(String partNumber, String partDiscription, int quantity, Double price) {
		super();
		this.partNumber = partNumber;
		this.partDiscription = partDiscription;
		this.quantity = quantity;
		this.price = price;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public String getPartDiscription() {
		return partDiscription;
	}

	public int getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public void setPartDiscription(String partDiscription) {
		this.partDiscription = partDiscription;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER PART NAME:: ");
		this.partNumber = sc.nextLine();
		System.out.print("ENTER PART DISCRIPTION:: ");
		this.partDiscription = sc.nextLine();
		System.out.print("ENTER QUANTITY:: ");
		this.quantity = sc.nextInt();
		if(quantity<0) {
			this.setQuantity(0);
		}
		System.out.print("ENTER PRICE:: ");
		this.price = sc.nextDouble();
		if(price<0) {
			this.setPrice(0.0);
		}
	}
	
	public void displayData() {
		System.out.println("******************************");
		System.out.println("PARET NUMBER:: "+this.partNumber);
		System.out.println("ENTER PART DISCRIPTION:: "+this.partDiscription);
		System.out.println("ENTER QUANTITY:: "+this.quantity);
		System.out.println("ENTER PRICE:: "+this.price);
		System.out.println("******************************");

	}
	

	public void display() {
//		System.out.println("QUANTITY::"+quantity);
//		System.out.println("PRICE::"+price);
		System.out.println("YOUR INVOICE AMOUNT:: " + price * quantity);

	}

}

