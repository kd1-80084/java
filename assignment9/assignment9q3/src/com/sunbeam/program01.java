package com.sunbeam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class program01 {

	public static void main(String[] args) {
		 Student arr[]=new Student[5];
		 
		/*for(int i=0;i<5;i++)
		{
			arr[i]=new Student();
		}
		
		for(int i=0;i<5;i++)
		{
			arr[i].accept();;
		}*/
		 
		 arr[0]=new Student(10,"Mumbai","Ravi",40);
		 arr[1]=new Student(11,"Mumbai","Omkar",50);
		 arr[2]=new Student(12,"Pune","Ramesh",60);
		 arr[3]=new Student(13,"Namded","Ramesh",70);
		 arr[4]=new Student(14,"Thane","Deep",80);
		 
		 
		 System.out.println("before sort:: ");
		 for(Student ele:arr)
			 System.out.println(ele);
		 
		 //Arrays.sort(arr);
		 
		 System.out.println("after sort:: ");
		 for(Student ele:arr)
			 System.out.println(ele);
		 
		 
		 
		 class Studentcitymarknamecomparator implements Comparator<Student>{
			@Override
			public int compare(Student s1, Student s2) {
				int diff=s1.getCity().compareTo(s2.getCity());
				if(diff==0)
					diff=Double.compare(s1.getMarks() ,s2.getMarks());
				if(diff==0)
					diff=s1.getName().compareTo(s2.getName());
				return diff;
			} 
		 }
		 
		 Studentcitymarknamecomparator c1=new Studentcitymarknamecomparator();
		 
		 Arrays.sort(arr,c1);
			
		 
	}

}
