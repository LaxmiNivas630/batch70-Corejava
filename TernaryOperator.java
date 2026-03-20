package com.operators;

import java.util.Scanner;

//Ternary Operators--->
//Syntax :
//condition ? value _if_true :value_if_false

public class TernaryOperator {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		int z = 50;

		int max1 = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		System.out.println("Max1 value is : " + max1);

		int a = 10;
		int b = 20;
		int max = (a > b) ? a : b;
		System.out.println("Max value is : " + max);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age ? ");

		int age = sc.nextInt();
//		 boolean isEligible = (age > 18) ? true : false;

		String isEligible = (age > 18) ? "yes" : "No";
		System.out.println("The enter age is eligible..? " + isEligible);

	}

}
