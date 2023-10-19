//3.In above assignment use TreeSet instead of LinkedHashSet. Use natural ordering for the Book. 
//If any book with duplicate isbn is added, what will happen?
//Books are stored in which order?


package com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ProgramMain {
	
	public static void main(String [] args) {
		
		
		Set<Book> s1=new TreeSet<>();

		s1.add(new Book("b1",125.63,"krishna",1));
		s1.add(new Book("b5",387,"can love happen twice",1));
		s1.add(new Book("b3",250,"mrutunjay",1));
		s1.add(new Book("b501",567,"thik and grow rich",1));
		s1.add(new Book("b4",897,"yayati",1));
		s1.add(new Book("b1",123,"inteligent invester",1)); //--->dublicate book with same isbn
		
		
		Iterator<Book> itr=s1.iterator();
		while(itr.hasNext()) {
			Book b=itr.next();
			System.out.println(b);
		}
	}
}


//treeset uses NATURAL ORDERING as given in COMPARABLE inside the class BOOK 
//if we want add dublicate book it checks on basis of comparable logic we given 
//book order sorted in assending order 




















 