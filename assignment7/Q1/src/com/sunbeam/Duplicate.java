package com.sunbeam;

/*Q1. Declare two Arrays of type String. Find the duplicate values of an array of string values. (Hint:
use equals())*/
public class Duplicate {

	public static void main(String[] args) {
		String[] str1 = { "john", "moses", "reddy", "sanskar", "sonam" };

		String[] str2 = new String[5];
		str2[0] = "john";
		str2[1] = "sanskar";
		str2[2] = "yogesh";
		str2[3] = "Digvijay";
		str2[4] = "sonam";
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i].equals(str2[j]))
					System.out.println(str1[i]);
			}
		}

	}

}
