package com.javafundamentalmethods;

public class TestMethodDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started!");
		System.out.println("Student information : ");

		TestMethodDemo4 t4 = new TestMethodDemo4();

		System.out.println(" Student ID : " + t4.getStudentId());
		System.out.println("Student Name : " + t4.getSudentName());
		System.out.println("Student Age : " + t4.getStudentAge());
		System.out.println("Student Rank : " + t4.getSudentRank());
		System.out.println("Student height : " + t4.getStudentheight());
		System.out.println(" Student Weight : " + t4.getStudentWeight());
		System.out.println("Student Gender : " + t4.getStudentGender());
		System.out.println(" Student Passed : " + t4.isStudentPassed());

	}

	byte getStudentId() {
		return 101;

	}

	short getStudentAge() {
		return 22;

	}

	int getSudentRank() {
		int rank = 5;
		return rank;

	}

	float getStudentWeight() {
		float weight = 72;
		return weight;

	}

	char getStudentGender() {
		char gen = 'M';
		return gen;

	}

	boolean isStudentPassed() {
		boolean status = true;
		return status;
	}

	float getStudentheight() {
		float height = 5.8F;
		return height;
	}

	String getSudentName() {
		String name = "NivasBalu";
		return name;

	}

}
