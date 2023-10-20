//4. Use TreeSet to store all books in descending order of price. Natural ordering for the Book should be isbn (do not change it).
//Display them using iterator()and descendingIterator();
                   
package com.sumbeam;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProgramMain {

	public static void main(String[] args) {
		Set<Book> s1=new TreeSet<>();

		s1.add(new Book("b1",125.63,"krishna",1));
		s1.add(new Book("b5",387,"can love happen twice",1));
		s1.add(new Book("b3",250,"mrutunjay",1));
		s1.add(new Book("b501",567,"thik and grow rich",1));
		s1.add(new Book("b4",897,"yayati",1));
		
		System.out.println("print according natural ordering");
		
		Iterator<Book> itr=s1.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			System.out.println(b);
		}
		
		class pricecomparator implements Comparator<Book>{
			public int compare(Book b1, Book b2) {
				int diff=Double.compare(b1.getPrice(), b2.getPrice());
				return diff;
			}
		}
		
		pricecomparator comp=new pricecomparator();
	
		
		TreeSet<Book> s2=new TreeSet<>(comp);
		
		s2.add(new Book("b1",125.63,"krishna",1));
		s2.add(new Book("b5",387,"can love happen twice",1));
		s2.add(new Book("b3",250,"mrutunjay",1));
		s2.add(new Book("b501",567,"thik and grow rich",1));
		s2.add(new Book("b4",897,"yayati",1));
	
		System.out.println("print according to decresing price");

		Iterator<Book> itr1=s2.descendingIterator();  //---> DESCENDING ITRRATOR IS PRESENT IN TREESET 
		while(itr1.hasNext()) {
			Book b1=itr1.next();
			System.out.println(b1);
		}
		
				
	}

}
