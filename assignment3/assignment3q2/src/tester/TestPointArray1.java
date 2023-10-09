package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	public static void main(String[] args) {
		int count;
		int index;
		int i1, i2;
		int choice;
		Double distance = 0.0;

		System.out.print("ENTER HOW MANY INPUT YOU WANT:: ");
		Scanner scanner = new Scanner(System.in);
		count = scanner.nextInt();

		Point2D points[] = new Point2D[count];

		for (int i = 0; i < count; i++) {
			points[i] = new Point2D();
		}
		for (int i = 0; i < count; i++) {
			points[i].acceptData();
			;
		}

		do {
			System.out.println("********************");
			System.out.println("0.EXIT");
			System.out.println("1.DISPLAY DETAIS OF SPECIFIC POINT ");
			System.out.println("2.DSPLAY ALL POINTS");
			System.out.println("3.CALCULATE DISTANCE ");
			System.out.print("ENTER CHOICE:: ");
			choice = scanner.nextInt();
			System.out.println("********************");

			switch (choice) {
			case 1: {
				System.out.print("ENTER INDEX FOR SEARCH:: ");
				index = scanner.nextInt();
				if (index <= count) {
					points[index].getDisplay();
				} else
					System.out.println("PLEASE ENTER VALID INDEX");
			}
				break;

			case 2:
				for (int i = 0; i < count; i++) {
					points[i].getDisplay();
				}
				break;

			case 3: {
				System.out.println("ENTER 2 INDICES FOR CALCULATING DISTANCE");
				System.out.print("ENTER 1ST INDEX FOR SEARCH:: ");
				i1 = scanner.nextInt();
				if (i1 <= points.length - 1) {
					System.out.print("ENTER 2ST INDEX FOR SEARCH:: ");
					i2 = scanner.nextInt();
					if (i2 <= points.length - 1) {
						if (points[i1].isEqual(points[i2])) {
							System.out.println("WE CANNOT CALCULATE DISTANCE BETWEEN TWO POINTS");
						} else {
							distance = points[i1].displayDistance(points[i2]);
							System.out.println("Distance = " + distance);
						}
					} else
						System.out.println("PLEASE ENTER VALID INDEX");
				} else
					System.out.println("PLEASE ENTER VALID INDEX");
			}
				break;

			}
		} while (choice != 0);

	}

}