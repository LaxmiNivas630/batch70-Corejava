package com.javafundamental;

public class Studentinfo {
	String StudentName;
	int StudentId;
	int StudentAge;
	char Gender;
	int Telugu;
	int Hindi;
	int English;
	int Maths;
	int Science;
	int Social;
	int Studentdetails;

	static String college_name = "Jawahalal Nehru Technology Universitry Gurajada Vizianagaram";

	public static void main(String[] args) {

		Studentinfo t1 = new Studentinfo();

		t1.StudentName = "Akash>>>>>>>>>>>>>";
		t1.StudentId = 422;
		t1.StudentAge = 21;
		t1.Gender = 'M';
		t1.Telugu = 80;
		t1.Hindi = 70;
		t1.English = 85;
		t1.Maths = 90;
		t1.Science = 75;
		t1.Social = 65;
		t1.Studentdetails();

		Studentinfo t2 = new Studentinfo();

		t2.StudentName = "Balaji>>>>>>>";
		t2.StudentId = 423;
		t2.StudentAge = 22;
		t2.Gender = 'M';
		t2.Telugu = 90;
		t2.Hindi = 80;
		t2.English = 95;
		t2.Maths = 95;
		t2.Science = 85;
		t2.Social = 85;
		t2.Studentdetails();

	}

	public void Studentdetails() {
		int add = Telugu + Hindi + English + Maths + Science + Social;
		int avg = add / 6;
		System.out.println(StudentName);
		System.out.println(avg);
		System.out.println(add);

	}

}
