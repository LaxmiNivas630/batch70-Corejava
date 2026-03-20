package com.operators;

//Assignment operators or Compound  Operators are
//== += -= /= %=
public class TestAssignment {

	public static void main(String[] args) {

		int result = 0;
		double a = 5.5;
//		result = result + a;//Type mismatch: cannot convert from double to int

		result += a;// Result=result + a
		System.out.println("Addition : " + result);
		System.out.println("********************************");

		double b = 2.9;
//		result =(int) (result - b);//Type mismatch: cannot convert from double to int
		result -= b;
		System.out.println("Substraction :" + result);

		double c = 4.7;
		result *= c;
		System.out.println("Multiplication :" + result);

		double d = 3;
		result /= d;
		System.out.println("Division or Quotient : " + result);

		double e = 1;
		result %= e;// result = result%e---> result = 3/1 = 0
		System.out.println("Modulus or Reminder : " + result);
	}

}
