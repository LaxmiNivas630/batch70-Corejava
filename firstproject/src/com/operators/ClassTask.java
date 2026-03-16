package com.operators;

import java.util.Scanner;

public class ClassTask {

//	Arithmetic Operators : + - * / %
//	wAP to calculate the values which received from console
	public static void main(String[] args) {
		System.out.println("Main method started !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();// 100

		System.out.println("Enter b number : ");
		int b = sc.nextInt();// 50

//		String + anything is String only 
//		System.out.println("Addition : " + a + b);//10050

//		BODMAS
		System.out.println("Addition : " + (a + b));// 150

//		The operator - is undefined for the argument type(s) String, int
//		System.out.println("Subtraction : " + a - b);//CE
		System.out.println("Substraction : " + (a - b));

		System.out.println("Multipicaction : " + a * b);// 50

		System.out.println("Division : " + a / b);// --->Quotient ---> 98/10--->9
		System.out.println("Modulus : " + a % b);// ---> Reminder ---> 98/10--->8
	}

}
