package com.sunbeam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		int choice = 0;
		Book b1;
		List<Book> list = new ArrayList<>();

		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("*********************************************************");
			System.out.println("0.exit");
			System.out.println("1.add book");
			System.out.println("2.Display all books in forward order using random access");
			System.out.println("3. Search a book with given isbn");
			System.out.println("4. Delete a book at given index.");
			System.out.println("5. Delete a book with given isbn.");
			System.out.println("6. Reverse the list ");
			System.out.print("enter your choice::");
			choice = sc.nextInt();
			System.out.println("*********************************************************");

			switch (choice) {
			case 1:
				b1 = new Book();
				b1.Accept();
				if (list.contains(b1)) {
					int index = list.indexOf(b1);
					Book b2 = list.get(index);
					b2.setQuantity(b2.getQuantity() + b1.getQuantity());
				}else {
					list.add(b1);
					System.out.println("one book added sussesfully");
				}
					
				break;
			case 2: {
				Iterator<Book> itr = list.iterator();
				while (itr.hasNext()) {
					b1 = itr.next();
					System.out.println(b1);
				}
			}
				break;
			case 3: {
				System.out.print(("enter ISBN of book for search:: "));
				String isbn = sc.next();
				Book key = new Book();
				key.setIsbn(isbn);
				int index=list.indexOf(key);
				
				if(index==-1)
					System.out.println("book is not found in list");
				else
					System.out.println(key);	
			}
				break;
			case 4: {
				System.out.println("enter index to remove book:: ");
				int index = sc.nextInt();
				list.remove(index);
				System.out.println("one book removed");
			}
				break;
			case 5: {
				System.out.print(("enter ISBN of book:: "));
				String isbn = sc.next();
				Book key = new Book();
				key.setIsbn(isbn);
				if (list.contains(key)) {
					list.remove(key);
				}
				System.out.println("one book removed");
			}
				break;
			case 6: {
				System.out.println("reversed list");
				ListIterator<Book> itr = list.listIterator(list.size());
				while (itr.hasPrevious()) {
					b1 = itr.previous();
					System.out.println(b1.toString());
				}
			}
				break;

			default:
				System.out.println("enter valid choice.....:(");
				break;
			}
		} while (choice != 0);

	}

}
