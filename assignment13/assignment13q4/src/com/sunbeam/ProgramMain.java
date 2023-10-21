package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;

public class ProgramMain {

	public static void main(String[] args) {
	
		try(FileReader fr= new FileReader("/home/sunbeam/CDAC/assignments/java_practice/day15/assignment13q-3/file.txt")){
			try(BufferedReader br=new BufferedReader(fr)) {
				String line;
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
