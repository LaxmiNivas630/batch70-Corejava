package com.operators;


//Assignment operators or Compound  Operators are
//== += -= /= %=
public class TestAssignment {

	public static void main(String[] args) {
		
		int result = 0;
		double a = 5.5;
//		result = result + a;//Type mismatch: cannot convert from double to int
		
		result +=a;//result + a
		System.out.println(result);

	}

}
