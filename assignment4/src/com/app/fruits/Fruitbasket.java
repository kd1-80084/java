package com.app.fruits;

import java.util.Scanner;

public class Fruitbasket {

	public static void main(String[] args) {

		Fruit f1;
		int number;
		int choice;
		int counter = 0;

		System.out.print("ENTER HOW MANY FRUITS YOU WANT TO PURCHASES:: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		Fruit fruit[] = new Fruit[number];

		do {
			System.out.println("***************************************");
			System.out.println("0.EXIT");
			System.out.println("1.ADD MANGO");
			System.out.println("2.ADD ORANGE");
			System.out.println("3.ADD APPLE");
			System.out.println("4.DISPLAY ALL NAMES OF FRUIT IN BASKET");
			System.out.println("5.DISPLAY PROPERTIES OF ALL FRSH FRUITS");
			System.out.println("6.DISPLAY TEST OF ALL STALE FRUITS");
			System.out.println("7.MARK FRUIT AS STALE");
			System.out.println("8.MARK SOUR FRUIT AS STALE");
			System.out.print("ENTER YOUR CHOICE:: ");
			choice = sc.nextInt();
			System.out.println("***************************************");

			switch (choice) {
			case 0:
				break;
			case 1: 
				{	
					if (counter < fruit.length) {
						fruit[counter] = new Mango();
						fruit[counter].Accept();
						counter++;
						System.out.println("ONE APPLE IS ADDED TO YOUR BASKET");
					} else
						System.out.println("YOU HAVE EXCEEDE THE BASKET LIMIT");

				}
				break;

			case 2: 
				{
					if (counter < fruit.length) {
						fruit[counter] = new Orange();
						fruit[counter].Accept();
						counter++;
						System.out.println("ONE ORANGE IS ADDED TO YOUR BASKET");
					} else
						System.out.println("YOU HAVE EXCEEDE THE BASKET LIMIT");

				}
				break;

			case 3: 
				{
					if (counter < fruit.length) {
						fruit[counter] = new Apple();
						fruit[counter].Accept();
						counter++;
						System.out.println("ONE APPLE IS ADDED TO YOUR BASKET");
					} else
						System.out.println("YOU HAVE EXCEEDE THE BASKET LIMIT");
				}
				break;

			case 4:
				{	
					for(int i =0;i<counter;i++)
					{
							System.out.println("NAME FRUIT["+i+"]:: "+fruit[i].getName());
					}
				}
				break;
				
			case 5:
				{	
					for(int i =0;i<counter;i++)
					{
						if(fruit[i].isIsfresh())
							System.out.println("NAME FRUIT["+i+"]:: "+fruit[i].toString());
					}
				}
				break;
				
			case 6:
				{	
					for(int i =0;i<counter;i++)
					{
						if(fruit[i].isIsfresh()== false)
						System.out.println("TEST OF FRUIT IS:: "+fruit[i].test());
					}
				}
				break;
				
			case 7:
			{	
				int index;
				System.out.print("ENTER THE INDEX FOR FRUIT:: ");
				 sc= new Scanner(System.in);
				 index= sc.nextInt();
				 
				 if(index<counter)
				 {
					 if(fruit[index].isIsfresh()==false)
					 {
						 System.out.println("FRUIT IS ALREADY STALE ");
					 }
					 else
					 {
						 fruit[index].setIsfresh(false);
						 System.out.println("FRUIT IS MARK AS STALE");
					 }
				 }
				 else
					 System.out.println("ENTER VALID INDEX -_- -_- -_- -_-");	  
			}
			break;
			
			case 8:
			{
				for(int i =0;i<counter;i++)
				{
					if(fruit[i].test()=="SOUR")
						fruit[i].setIsfresh(false);
				}
				
			}
			break;
			
			default:
				System.out.println("ENTER VALID CHOICE......");
				break;
			}

		} while (choice != 0);

	}

}
