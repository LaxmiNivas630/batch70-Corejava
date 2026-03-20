package com.operators;

//5) Logical Operators   : || && ! are also will give you boolean values
public class LogicalOperators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 100;

		System.out.println(a == b && a == c);// false
		System.out.println(a > b && a == c);// false
		System.out.println(a == c && a < b);// false
		System.out.println(a < b && a != c);// true

		System.out.println("***********");
		System.out.println(a == b || a == c);// false
		System.out.println(a != b || a != c);// true

		System.out.println("*************");
		System.out.println(!(a == c));// true

		System.out.println("*********************");
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		System.out.println(true || true);// true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false

		System.out.println(!true);// false
		System.out.println(!false);// true

	}

}
