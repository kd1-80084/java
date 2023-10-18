package com.sunbeam;

public class Palindrome {

	public static void main(String[] args) {
		String str="mam";
		String str1="aam";
		System.out.println(str);
		StringBuffer s=new StringBuffer(str);
		s.reverse();
		System.out.println(s);
		if(str.contentEquals(s))
		{
			System.out.println("String is palindrome ");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
//		boolean flag=false;
//		for(int i=0;i<str.length();i++)
//		{
//			if(str.charAt(i)==str1.charAt(i))
//			{
//				flag=true;
//			}
//			else
//				flag=false;
//		}
//		if(flag==true)
//		{
//			System.out.println("P");
//		}
//		else if(flag==false)
//			System.out.println("Not");

	}

}
