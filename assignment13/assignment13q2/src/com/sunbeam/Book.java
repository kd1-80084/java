package com.sunbeam;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Book implements Serializable {
	private String isbn;
	private double price;
	private String authername;
	private int quantity;

	public Book() {

	}

	public Book(String isbn, double price, String authername, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authername = authername;
		this.quantity = quantity;
	}

	void Accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter isbn:: ");
		this.isbn = sc.nextLine();
		System.out.print("enter price:: ");
		this.price = sc.nextDouble();
		sc.nextLine();
		System.out.print("enter authername:: ");
		this.authername = sc.nextLine();
		System.out.print("enter quantity:: ");
		this.quantity = sc.nextInt();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthername() {
		return authername;
	}

	public void setAuthername(String authername) {
		this.authername = authername;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authername=" + authername + ", quantity=" + quantity
				+ "]";
	}
}
