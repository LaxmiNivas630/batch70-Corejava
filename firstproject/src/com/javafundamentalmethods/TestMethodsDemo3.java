package com.javafundamentalmethods;

//no argument + with return type 
public class TestMethodsDemo3 {

	static {
		System.out.println("static method");

	}

// instance method
	void main(String[] args) {
		System.out.println("main method started !");
		System.out.println("The Employee age is : " + getEmployeeAge());

		double sal = getSalary();
		double bonus = getBonus();

		System.out.println("Total salary is : " + (sal + bonus));// bodmas

//		System.out.println("Total salary is : " + (getSalary() + getBonus());
	}

	int getEmployeeAge() {
		int age = 22;
		int age1 = 23;
		return age;

	}

	double getSalary() {
		double salary = 50000.00;
		return salary;
	}

	double getBonus() {
		double Bonus = 20000.00;
		return Bonus;

	}

}
