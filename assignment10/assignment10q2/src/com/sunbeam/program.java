package com.sunbeam;



import java.util.*;

public class program {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		Collections.addAll(list, "krishna","ganesh","ganesh","manisha","shreya","ravi","rahul")	;
		
		
		class StringComparator implements Comparator<String>{
			@Override
			public int compare(String s1,String s2)
			{
				int diff=s1.length()-s2.length();
				return diff;
			}	
		}
		
		StringComparator comp=new StringComparator();
		
		String maxvalue=Collections.max(list,comp);
		
		System.out.println("max length string:: "+maxvalue);
	}
}
