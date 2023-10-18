package com.sunbeam;

/*Q2. Write a java program to reverse a String*/
public class Reverse {

	public static void main(String[] args) {
		String str = "Pranav";

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("Before Reverse - " + str);
		System.out.println("After Reverse - " + sb);

	}

}
