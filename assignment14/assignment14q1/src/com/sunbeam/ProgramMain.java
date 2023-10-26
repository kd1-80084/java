package com.sunbeam;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ProgramMain {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		Candidate c = new Candidate();
		do {
			System.out.println("******************************");
			System.out.println("0.exit");
			System.out.println("1.add candidate");
			System.out.println("2.for update the candidate");
			System.out.println("3.get partywaisevotes");
			System.out.println("enter the choice");
			choice = sc.nextInt();
			System.out.println("******************************");

			switch (choice) {
			case 1:{

				System.out.print("enter name:: ");
				String name = sc.next();
				System.out.print("enter party:: ");
				String party = sc.next();
				System.out.print("enter votes:: ");
				int votes = sc.nextInt();
				c.setName(name);
				c.setParty(party);
				c.setVotes(votes);
				try {
					CandidateDao.save(c);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
				break;
			case 2:{
				System.out.print("enter id of candidate for update::");
				int id = sc.nextInt();
				System.out.print("enter name:: ");
				String name = sc.next();
				System.out.print("enter party:: ");
				String party = sc.next();
				c.setId(id);
				c.setName(name);
				c.setParty(party);
				
				try(CandidateDao dao = new CandidateDao()){
					dao.update(c);		
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
				break;
			case 3:
			{ 
			
				try(CandidateDao dao=new CandidateDao()){
					List<PartyVotes> list=dao.getPartywiseVotes();
					list.forEach(a->System.out.println(a));
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
				break;

			default:
				System.out.println("enter valid choice.......):");
				break;
			}
		} while (choice != 0);

		Candidate c1 = new Candidate(10, "pranav", "congress", 10);

		try {
			CandidateDao.save(c1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
