package com.javafundamentalmethodsconstructors;

public class Student1 {
	String sid;
	String sname;
	int sage;

	Student1() {
		System.out.println("StudentBtech422 no-arg constructor called ");
	}

//	parameterized constructors
	Student1(String sid, String sname, int sage) {
		System.out.println(" parameterized constructor called ");
		this.sid=sid;
		this.sname=sname;
		this.sage=sage;
		

	}

	public static void main(String [] args) {
		System.out.println("main method started ! ");

		Student1 s1 = new Student1("JFS-B70-422", "Sonu", 22);
		s1.show();

		Student1 s2 = new Student1("JFS-B70-415", "Akash", 21);
		s2.show();

		System.out.println("main method ended !! ");

	}

	void show() {
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);
		System.out.println("************************************");

	}

}
