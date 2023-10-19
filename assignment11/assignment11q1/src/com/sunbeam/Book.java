package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book {
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
		System.out.println("enter isbn:: ");
		this.isbn = sc.next();
		System.out.println("enter price:: ");
		this.price = sc.nextDouble();
		System.out.println("enter authername:: ");
		this.authername = sc.next();
		System.out.println("enter quantity:: ");
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
	
	@Override
	public int hashCode() {
		int hash = Objects.hash(this.isbn);
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Book) {
			Book other = (Book) obj;
			if (this.isbn.equals(other.isbn))
				return true;
		}
		return false;
		
	}
}
