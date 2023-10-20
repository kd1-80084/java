package com.sunbeam;

import java.util.Random;
import java.util.stream.Stream;

public class ProgramMain {

	public static void main(String[] args) {
		
		Random r=new Random();
		Stream<Integer> strm=Stream.generate(()->r.nextInt(20)).limit(10);
		int result=strm.reduce(0, (a,e)->a+e);
		System.out.println(result);
		

	}

}
