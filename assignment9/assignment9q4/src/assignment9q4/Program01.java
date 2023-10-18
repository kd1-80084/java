//Store book details in a library in a list -- ArrayList.
//Book details: isbn(string), price(double), authorName(string), quantity(int)
//Write a menu driven (do-while + switch-case) program to
//1. Add new book in list.
//2. Display all books in forward order.
//3. Delete at book given index -- list.remove(index);
//4. Check if book with given isbn is in list or not
//5. Delete all books in list
//6. Display number of books in list
//7. Sort all books by price in desc order -- list.sort();

package assignment9q4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Book b;
		int choice=0 ;
		int index;
		
		Collection <Book>booklist=new ArrayList<Book>();
		
		do {
			
				System.out.println("0.exit");
				System.out.println("1.add boob");
				System.out.println("2.Display all books in forward order.");
				System.out.println("3.Delete at book given index");
				System.out.println("4.Check if book with given isbn is in list or not");
				System.out.println("5.Delete all books in list");
				System.out.println("6. Display number of books in list");
				System.out.println("7. Sort all books by price in desc order");
				System.out.print("enter your choice:: ");
				Scanner sc=new Scanner(System.in);
				choice=sc.nextInt();

			
				switch (choice) {
				case 1:
					b=new Book();
					b.Accept();
					booklist.add(b);
					break;
					
				case 2:
					for(Book element:booklist)
						System.out.println(element);
					break;
					
				case 3:
					System.out.println("enter index of book to remove:: ");
					
					 index=sc.nextInt();
					 booklist.remove(index);
					break;
					
				case 4:
					
					break;
					
				case 5:
					booklist.clear();
					break;
					
				case 6:
					System.out.println("size:: "+booklist.size());
					break;
					
				case 7:
				{
					class bookcomparator implements Comparator<Book>{
						@Override
						public int compare(Book b1, Book b2) {
							int diff=-(Double.compare(b1.getPrice(), b2.getPrice()));
							return diff;
							}
						}
						
						bookcomparator cmp=new bookcomparator(); S
						booklist.sort(cmp);
						
					break;
				}
				}
			
			}while(choice!=0);
		}
	}
