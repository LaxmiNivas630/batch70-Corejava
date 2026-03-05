package com.javafundamentalmethodsconstructors;

public class Employee {

	String eid;
	String ename;
	double salary;

	Employee() {
		System.out.println("no-arg constructor called ");
		eid = "216F1A0422";
		ename = "Unknown";
		salary = 80000.00;

	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Employee e1 = new Employee();
		e1.display();

		System.out.println("main method end ");

	}

	void display() {
		System.out.println("Emp ID : " + eid);
		System.out.println("Emp name : " + ename);
		System.out.println("Emp salary : " + salary);
	}
}
