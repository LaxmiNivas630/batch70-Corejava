package com.javafundamentalmethodsconstructors;

public class Employee1 {

	String eid;
	String ename;
	double salary;

	Employee1() {
		System.out.println("no-arg constructor called ");
		eid = "216F1A0422";
		ename = "Unknown";
		salary = 80000.00; 

	}
	
//To avoid ambiguity problems, we must provide same for constructor parameters and
//	when we have same names we must need to use this to invoke current class object data members.
	Employee1(String eid, String ename, double salary) {
		System.out.println("parameterized construct called ");
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;

	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Employee1 e1 = new Employee1();
		e1.display();

		Employee1 e2 = new Employee1("216F1A0422", "Sonu", 100000);
		e2.display();
		
		System.out.println("main method end ");

	}

	void display() {
		System.out.println("Emp ID : " + eid);
		System.out.println("Emp name : " + ename);
		System.out.println("Emp salary : " + salary);
		System.out.println("*************************************");
	}
}
