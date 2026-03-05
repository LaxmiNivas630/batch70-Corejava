package com.javafundamentalmethodsconstructors;

public class Book {
	String bookname;
	String author;
	double price;
	String date;

	Book() {
		this("Niku Enduku");
		System.out.println(" *************No arg constructor called");
		

	}

	Book(String bookName) {
		this("Niku Enduku", "Nandhan");
		System.out.println("************* One arg constructor");

	}

	Book(String bookname, String author) {
		this("Ramayan","Valmiki",10000,"29BC");
		System.out.println(bookname);
		System.out.println(author);
		System.out.println("************Two arg constructor");
		

	}

	Book(String bookname,String author,double price,String date) {
		System.out.println(bookname );
		System.out.println(author );
		System.out.println(price );
		System.out.println(date );
		System.out.println(" Three arg constructor");

	}

	public static void main(String[] args) {

		Book b = new Book();

	}

}
