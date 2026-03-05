package com.javafundamentalmethodsconstructors;

public class StudentBtech422 {
	String sid;
	String sname;
	int sage;

	StudentBtech422() {
		System.out.println("StudentBtech422 no-arg constructor called ");
	}

	public static void main(String[] args) {
		System.out.println("main method started ! ");

		StudentBtech422 s1 = new StudentBtech422();
		s1.sid = "Jfs-B70-422";
		s1.sname = "Balu";
		s1.sage = 22;
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.sage);

		StudentBtech422 s2 = new StudentBtech422();
		s2.sid = "Jfs-B70-415";
		s2.sname = "NivasBalu";
		s2.sage = 22;
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.sage);

		System.out.println("main method ended !! ");

	}

}
