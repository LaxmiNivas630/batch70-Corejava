package com.operators;

public class TestUnaryOperator1 {

	public static void main(String[] args) {
	
		int a = 5;
		int b= 4;
		
		System.out.println(b++);//4-->5
		System.out.println(++a);//6
		System.out.println(b--);//5-->4
		System.out.println(--b);//3
		System.out.println(a--);//6-->5
		System.out.println(b++);//3-->4
		System.out.println(++b);//5
		System.out.println(--a);//4
		System.out.println(a - b);//-1
		System.out.println(a++);//4-->5
		System.out.println(--b);//4
		
		System.out.println("a value is : " + a);//5
		System.out.println("b value is :" + b);//4
		
		//5 + 4 = 9 -->7 + 6 =13 -->9+13=22
		System.out.println(a++ + b++ + ++a + ++b);//22
		
//		
		System.out.println(a++ + ++b - ++a + --b);//

	}

}
