package com.javafundamentalmethods;

//addition(); ---> +
//Subtraction(); ----> -
//Multiplication() ---> *
//division() ---> / ----> quotient
//modulus() ---> % ----> reminder

public class TestDemo2 {

	void addition() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	void subtraction() {
		int a = 100;
		int b = 200;
		System.out.println(a - b);
	}

	void multiplication() {
		int x = 100;
		int y = 200;
		System.out.println(x * y);
	}

	void division() {
		int a = 200;
		int b = 4;
		System.out.println(a / b);

	}

	void modulus() {
		int m = 99;
		int n = 6;
		System.out.println(m % n);
	}

	void main() {
		System.out.println("main method started !");
		addition();
		subtraction();
		multiplication();
		division();
		modulus();

	}

}
