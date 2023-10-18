package com.sunbeam;

import java.util.Comparator;

public class Program01 {

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

	Double arr[]= {1.1,2.5,3.8,5.5,4.4};
	
	class doublecomparator implements Comparator<Double>{
		@Override
		public int compare(Double d1, Double d2) {
			int diff=Double.compare(d1,d2);
			return diff;
			}
		}
	
	doublecomparator cmp=new doublecomparator();
	
	selectionSort(arr,cmp);

	System.out.println("after sort::"); 
	for(Double ele:arr)
		System.out.println(ele);
	
	
	}

}
