package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Student {
	private Integer rollno;
	private String name;
	private Integer marks;

	Student() {

	}

	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter  rollno:: ");
		this.rollno = sc.nextInt();
		sc.nextLine();
		System.out.print("enter name:: ");
		this.name = sc.nextLine();
		System.out.println("enter marks:: ");
		this.marks = sc.nextInt();
	}

	public int hashCode() {
		int hash = Objects.hash(this.rollno);
		return hash;
	}

	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (obj instanceof Student) {
			Student other = (Student) obj;
			if (this.rollno == other.rollno);
			return true;
		}
		return false;
	}
}
