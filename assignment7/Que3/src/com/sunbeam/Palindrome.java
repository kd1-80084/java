package com.sunbeam;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		System.out.println(str);
		StringBuffer s = new StringBuffer(str);
		s.reverse();
		System.out.println(s);
		if (str.contentEquals(s)) {
			System.out.println("String is palindrome ");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
