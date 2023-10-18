package com.sunbeam;

import java.util.Scanner;

class Student implements Comparable<Student> {
	private int roll;
	private String name;
	private String city;
	private double marks;

	public Student() {

	}

	public Student(int roll, String name, String city, double marks) {
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER ROLLNO:: ");
		this.roll = sc.nextInt();
		System.out.print("ENTER NAME:: ");
		this.name = sc.next();
		System.out.print("ENTER CITY:: ");
		this.city = sc.next();
		System.out.print("ENTER MARKS:: ");
		this.marks = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	
	@Override
	public int compareTo(Student s2) {
		int diff = -(this.getCity().compareTo(s2.getCity()));
		if (diff == 0)
			diff = -Double.compare(this.getMarks(), s2.getMarks());
		if (diff == 0)
			diff = this.getName().compareTo(s2.getName());
		return diff;
	}

}
