package com.javafundamentalmethodsconstructors;

public class Student {
	int tel;
	int hin;
	int eng;
	String name;

	Student(int tel, int hin, int eng, String name) {
		this.tel = tel;
		this.hin = hin;
		this.eng = eng;
		this.name = name;
		System.out.println(tel);
		System.out.println(hin);
		System.out.println(eng);
		System.out.println(name);

	}

	public static void main(String[] args) {
		Student t = new Student(80, 90, 79, "Abc");

	}

}
