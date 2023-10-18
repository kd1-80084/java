package com.sunbaem;

import java.util.*;


public class program {

	public static void main(String[] args) {
		int choice = 0;
		LinkedList<Employee> emplist = new LinkedList<Employee>();

		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("***********************");
			System.out.println("0.exit");
			System.out.println("1.add");
			System.out.println("2.Delet");
			System.out.println("3.Find");
			System.out.println("4.Sort");
			System.out.println("5.Edit");
			System.out.print("enter your choice::");
			choice = sc.nextInt();
			System.out.println("**********************");

			switch (choice) {
			case 1: {
				Employee e1 = new Employee();
				e1.accept();
				emplist.add(e1);
				System.out.println("one employee is added");
			}
				break;
			case 2: {
				System.out.println("enter index :: ");
				int index = sc.nextInt();

				if (index < 0)
					System.out.println("employee cannot found");
				else
					emplist.remove(index);
				System.out.println("one employee is deleted");
			}
				break;
			case 3: {
				System.out.println("enter empid :: ");
				int id = sc.nextInt();
				Employee e2 = new Employee();
				e2.setEmpid(id);

				if (emplist.contains(e2)) {
					int index = emplist.indexOf(e2);
					Employee e3 = emplist.get(index);
					System.out.println(e3);
				} else
					System.out.println("employee is not present");

			}
				break;
			case 4: {
				class EmpComparator implements Comparator<Employee> {
					@Override
					public int compare(Employee e1, Employee e2) {
						int diff = e1.getEmpname().compareTo(e2.getEmpname());
						return diff;
					}
				}

				EmpComparator com = new EmpComparator();
				emplist.sort(com);
				System.out.println(emplist);
			}
				break;
			case 5: {
				System.out.println("Enter emp id to be modified: "); 
				int id = sc.nextInt(); 
				Employee key = new Employee(); 
				
				key.setEmpid(id); 
				int index = emplist.indexOf(key); 
				if(index == -1) 
				    System.out.println("Employee not found."); 
				else { 
				    Employee oldEmp = emplist.get(index); 
				    System.out.println("Employee Found: " + oldEmp); 
				    System.out.println("Enter new information for the Employee"); 
				    Employee newEmp = new Employee(); 
				    newEmp.accept(); 
				    emplist.set(index, newEmp); 
				}
			}
				break;

			default:
				System.out.println("enter valid choice........:(");
				break;
			}
		} while (choice != 0);
	}

}
