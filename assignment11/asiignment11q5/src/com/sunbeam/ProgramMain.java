package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ProgramMain {

	public static void main(String[] args) {

		Map<String, Book> m1=new HashMap<>();
		int choice;
		do {
			
			System.out.println("***************************");
			System.out.println("0.exit");
			System.out.println("1.add book");
			System.out.println("2.find in map");
			System.out.println("3.display all books");
			System.out.print("enter your choice:: ");
			Scanner sc= new Scanner (System.in);
			choice=sc.nextInt();
			System.out.println("***************************");

			switch (choice) {
			case 1://add book
			{
				Book b1=new Book();
				b1.Accept();
				m1.put(b1.getIsbn(), b1);
				System.out.println("added sussesfully");
			}
				break;

			case 2://get book
			{
				sc.nextLine();
				System.out.print("enter ISBN for srearching:: ");
				String s1=sc.nextLine();
				Book key=m1.get(s1);
				System.out.println(key.toString());
			}
				break;
				
			case 3:
			{
				Set<Entry<String,Book>>entries=m1.entrySet();
				for(Entry<String,Book> en:entries)
					System.out.println(en.getKey()+"-" +en.getValue());
			}
				break;
				
			default:
				System.out.println("enter valid input........:(");
				break;
			}

		} while (choice != 0);
	}

}
