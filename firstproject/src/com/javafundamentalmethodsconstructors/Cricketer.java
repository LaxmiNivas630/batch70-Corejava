package com.javafundamentalmethodsconstructors;

import java.util.Scanner;

//Note : In java, If the program does not contain any constructor any explicit constructor 
// then Java Compiler will create a constructor name called default constructor.

//ex: it looks like below
//syntax : public Cricketer(){ 

//}
public class Cricketer {

	int jno;
	String name;

//	no-arg constructor
	Cricketer() {
		System.out.println("No-arg constructor called !");

	}
	
	{
		System.out.println("instance block called !");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
//	Note1:	The below Object is created with the help of default constructor.
//		Whenever the class does not contains any other constructors then java
//		Compiler will create default constructor

// Note2: The below object is created  with the help of no-arg constructor.
//		Whenever the class contains any constructor then Java compiler will not create 
//		default constructor, Now we have explicit no-arg constructor so the below object is created with the help of no-arg constructor. 
		Cricketer c1 = new Cricketer(); // cricketer() --->constructor calling
		c1.jno=7;
		c1.name="MSD";
		System.out.println(c1.jno);
		System.out.println(c1.name);

//		The constructor Scanner() is undefined
//		Scanner sc = new Scanner();

		System.out.println("main method ended ");

	}

}
