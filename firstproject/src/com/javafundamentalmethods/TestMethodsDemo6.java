package com.javafundamentalmethods;

import java.util.Scanner;

public class TestMethodsDemo6 {

	public static void main(String[] args) {
		System.out.println("Main method started !");
		// Scanner sc = new Scanner();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		System.out.println("Enter your First  name : ");
		String fname = sc.next();

		System.out.println("Enter your Last  name : ");
		String lname = sc.next();

		TestMethodsDemo6 t = new TestMethodsDemo6();
		t.getEmployeeAge(age);
		t.getEmployeeFullName(fname, lname);

		sc.close();

	}

	void getEmployeeAge(int age) {
		System.out.println("Employee age is : " + age);
	}

	void getEmployeeFullName(String fn, String ln) {
		System.out.println("The full name of Employee is : " + fn + " " + ln);

	}
}
