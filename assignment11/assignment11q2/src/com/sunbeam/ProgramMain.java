//In above assignment use LinkedHashSet instead of HashSet. If any book with duplicate isbn is added, what will happen? 
//Books are stored in which order?

package com.sunbeam;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramMain {

	public static void main(String[] args) {
		Set<Book>set2 =new LinkedHashSet<Book>();
		
		set2.add(new Book("b1",120,"c++ book",1));
		set2.add(new Book("b5",387,"can love happen twice",1));
		set2.add(new Book("b3",250,"mrutunjay",1));
		set2.add(new Book("b104",567,"thik and grow rich",1));
		set2.add(new Book("b4",897,"yayati",1));
		set2.add(new Book("b1",123,"inteligent invester",1)); //--->dublicate book with same isbn

		
			Iterator<Book>itr=set2.iterator();
			while(itr.hasNext()) {
				Book b=itr.next();
				System.out.println(b);
			}
				
			
	}

}

//in linkedhash set if we want to add dublicate book 
//it will show only once  beacuse of hash and equals method
//and oreder is according to they are added.




















