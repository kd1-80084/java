package com.sunbeam;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		User u = new User();
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("******************************");
			System.out.println("0.exit");
			System.out.println("1.add user");
			System.out.println("2.select user  by user id");
			System.out.println("3.update user name");
			System.out.println("4.delete user by user id");
			System.out.println("5.display all user");
			System.out.println("enter the choice");
			choice = sc.nextInt();
			System.out.println("******************************");

			switch (choice) {
			case 0:
				break;
			case 1: {
				try (UserDao dao = new UserDao()) {
					System.out.print("enter first name::");
					String fname = sc.next();
					System.out.print("enter last name::");
					String lname = sc.next();
					System.out.print("enter email:: ");
					String email = sc.next();
					System.out.print("enter password:: ");
					String password = sc.next();
					System.out.print("enter date of birth(dd-MM-yyyy):: ");
					String date = sc.next();
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					java.util.Date udate = sdf.parse(date);

					u.setFirst_name(fname);
					u.setLast_name(lname);
					u.setEmail(email);
					u.setPassword(password);
					u.setBirthdate(udate);

					int cnt = dao.addUser(u);

					System.out.println("rows affected:: " + cnt);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

				break;
			case 2: {
				System.out.print("enter user id to find:: ");
				int userid = sc.nextInt();
				try {
					try (UserDao dao = new UserDao()) {
						User u1 = dao.findUserByID(userid);
						System.out.println(u1);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

				break;
			case 3: {
				System.out.print("enter userid for update:: ");
				int id = sc.nextInt();
				System.out.println("enter name to update:");
				String fname = sc.next();
				try (UserDao dao = new UserDao()) {

					int cnt = dao.updateUserName(id, fname);
					System.out.println("row affected: " + cnt);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
				break;
			case 4: {
				System.out.print("enter userid for delete:: ");
				int id = sc.nextInt();
				try (UserDao dao = new UserDao()) {
					int cnt = dao.deleteUserByID(id);
					System.out.println("row affected:: " + cnt);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
				break;

			case 5: {
				try (UserDao dao = new UserDao()) {
					List<User> list = dao.displayAllUsers();
					list.forEach(a -> System.out.println(a));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				break;
			default:
				System.out.println("enter valid input......:(");
				break;
			}

		} while (choice != 0);
	}

}
