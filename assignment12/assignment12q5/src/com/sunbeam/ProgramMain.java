package com.sunbeam;

public class ProgramMain {

	static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T i : arr) {
			if (c.compare(i, key))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		Double arr[]= {1.1,1.2,1.3,1.2,1.5,1.8,1.2};
		Double key= 1.2;
		int result=countIf(arr, key,(e,k)->e.equals(k));
		System.out.println(result);

	}

}
