package com.javafundamentalmethods;

public class TestDemo3Practice {

	static void add(int a, int b) {
		int c = a + b;
		sub(c, 10);

		System.out.println(c);

	}

	static void sub(int a, int b) {

		int d = a - b;
        System.out.println(d);
		
        TestDemo3Practice t = new TestDemo3Practice();

		t.multi(d, 20);

	}

	void multi(int a, int b) {
		int e = a * b;
		System.out.println(e);
		
		div(e, 50);
	}

	void div(int a, int b) {

		int f = a / b;
		System.out.println(f);
	}

	public static void main(String[] args) {
		add(40, 50);

	}

}
