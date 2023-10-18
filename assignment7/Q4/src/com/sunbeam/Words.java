package com.sunbeam;

public class Words {

	public static void main(String[] args) {
		String str = "  How are you";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 32)
				count++;
		}
		//without using trim();
		System.out.println(str);
		
		System.out.println("------------------");
		
		//using trim()
		System.out.println(str.trim());
		
		System.out.println("------------------");
		//count
		System.out.println(count);
		
		//split
		System.out.println("------------------");
		String[] arr = str.split(" ", 0);
		for (String s : arr) {
			System.out.println(s);
		}
	}
}
