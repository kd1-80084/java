package com.sunbeam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookData {

	public static void writeBookInFile() {

		List<Book> listbook = new ArrayList<>();

		listbook.add(new Book("b1", 2050, "krishna", 1));
		listbook.add(new Book("b2", 125, "Pranav", 1));
		listbook.add(new Book("b3", 2050, "Yashraj", 1));
		listbook.add(new Book("b4", 2050, "tanay", 1));
		listbook.add(new Book("b5", 2050, "shekhar", 1));

		try (FileOutputStream fout = new FileOutputStream("book.txt")) {
			try (DataOutputStream dout = new DataOutputStream(fout)) {

				for (Book b : listbook) {
					dout.writeUTF(b.getIsbn());
					dout.writeDouble(b.getPrice());
					dout.writeUTF(b.getAuthername());
					dout.writeInt(b.getQuantity());
				}

			} // close dout

		} // close fout
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("book data written in file");
	}

	public static void readBookFRomFile() {
		try (FileInputStream fin = new FileInputStream("book.txt")) {
			try (DataInputStream din = new DataInputStream(fin)) {
				while (true) {
					Book b1 = new Book();
					b1.setIsbn(din.readUTF());
					b1.setPrice(din.readDouble());
					b1.setAuthername(din.readUTF());
					b1.setQuantity(din.readInt());
					System.out.println(b1);
				}
			}catch (EOFException e) {
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
