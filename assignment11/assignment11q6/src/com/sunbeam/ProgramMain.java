package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class ProgramMain {

	public static void main(String[] args) {

		Map<Integer, Student> map = new HashMap<>();
		int choice;

		do {
			System.out.println("************************");
			Scanner sc = new Scanner(System.in);
			System.out.println("0.exit");
			System.out.println("1.add student");
			System.out.println("2.find student in map");
			System.out.println("3.display all student");
			System.out.print("enter your choice:: ");
			choice = sc.nextInt();
			System.out.println("************************");

			switch (choice) {
			case 1:
			{
				Student s1=new Student();
				s1.accept();
				map.put(s1.getRollno(), s1);
				System.out.println("added sussesfully");
			}
				break;

			case 2:
			{
				sc.nextLine();
				System.out.print("enter Rolno for srearching:: ");
				Integer i1=sc.nextInt();
				
				Student key=map.get(i1);
				if(key==null)
					System.out.println("not fount");
				else
					System.out.println("found ::"+key);
			}
				break;

			case 3:
			{
				Set<Entry<Integer,Student>>entries=map.entrySet();
				for(Entry<Integer,Student> en:entries)
					System.out.println("rollno:: "+en.getKey()+"-" +en.getValue());
			}
			System.out.println("2.find student in map");

				break;

			default:
				break;
			}

		} while (choice != 0);

	}

}
