//Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. If any book with duplicate
//isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.


package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProgramMain {

	public static void main(String[] args) {
	
		Set<Book> set=new HashSet<>();
		set.add(new Book("b1",250.25,"c++ book",1));
		set.add(new Book("b3",250.25,"mrutunjay",1));
		set.add(new Book("b5",250.25,"can love happen twice",1));
		set.add(new Book("b4",250.25,"yayati",1));
		set.add(new Book("b104",250.25,"thik and grow rich",1));
		set.add(new Book("b1",250.25,"inteligent invester",1));
		//System.out.println(set);
	
		Iterator<Book>itr=set.iterator();
		while(itr.hasNext())
		{
			Book b1=itr.next();
			System.out.println(b1);
		}
						
	}
	

}


//Ans-
//in hashset if we want to add dublicate isbn isbn then it will not allow 
//hashcode and equals method checks for dublicate value.
//books are arranged accordinfg to hashcode.