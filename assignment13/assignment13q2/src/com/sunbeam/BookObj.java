package com.sunbeam;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class BookObj {

	public static void writeBookInFile() {

		List<Book> listbook = new ArrayList<>();

		listbook.add(new Book("b1", 2050, "krishna", 1));
		listbook.add(new Book("b2", 125, "Pranav", 1));
		listbook.add(new Book("b3", 2050, "Yashraj", 1));
		listbook.add(new Book("b4", 2050, "tanay", 1));
		listbook.add(new Book("b5", 2050, "shekhar", 1));

		try (FileOutputStream fout = new FileOutputStream("book.txt")) {
			try (ObjectOutputStream oout = new ObjectOutputStream(fout)) {

				for (Book b : listbook) {
					oout.writeObject(b);
				}

			} // close oout

		} // close fout
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("all book objects are written in files");
	}

	public static void readBookFRomFile() {
		try (FileInputStream fin = new FileInputStream("book.txt")) {
			try (ObjectInputStream din = new ObjectInputStream(fin)) {
				while (true) {
					Book b=(Book)din.readObject();
					System.out.println(b);
				}
			}catch (EOFException e) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
