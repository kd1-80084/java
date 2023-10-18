package com.sunbeam;

import java.util.Scanner;

public class Program01 {

	public static<Type extends Number> Type findMin(Type arr[]) {
		 Type minvalue=arr[0];
		 for(int i=0;i<4;i++)
		 {
			 if( arr[i].doubleValue()<minvalue.doubleValue())
				 minvalue=arr[i]; 
		 }
		 return minvalue;
	}

	public static void main(String[] args) {
		
		Integer arr[]= {22,55,77,11,33};
		Integer minvalue = findMin(arr);
		System.out.println("minvalue:: "+minvalue);
		 
	}
}
