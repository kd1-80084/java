package com.sunbeam;

import java.util.Comparator;

public class Program {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		Double arr1[]= {3.5,2.5,7.6,4.1,1.2};
		
		System.out.println("Before Sort: ");
		for (Double e : arr1)
			System.out.println(e);
		
		class DoubleArrayComparator implements Comparator<Double> {
			@Override
			public int compare( Double d1, Double d2) {
				int diff=d1.compareTo(d2);
					return diff;
			}
		}
		
		DoubleArrayComparator c1=new DoubleArrayComparator();
		
		selectionSort(arr1, c1);
		
		System.out.println("After Sort: ");
		for (Double e : arr1)
			System.out.println(e);
		
	}

}
