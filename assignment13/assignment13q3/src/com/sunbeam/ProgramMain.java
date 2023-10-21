package com.sunbeam;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(FileWriter fr= new FileWriter("file.txt")){
			try(BufferedWriter bwr=new BufferedWriter(fr)){
				for(int i=1; i<=4; i++) { 
				    String line = sc.nextLine(); 
				    bwr.write(line+"\n");
				} 
				 
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("date saved");
		

	}

}
