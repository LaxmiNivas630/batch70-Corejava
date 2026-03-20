package com.operators;


//Unary Operators :
//++ -- + -
// post-Increment
// pre-Increment
public class TestUnaryOperator {

	public static void main(String[] args) {

		int a = +10;//unary plus
		System.out.println(a);//10
		
		int b = -10;//unary minus 
		System.out.println(b);
		
		int i = 10;
		int j = 5;
		
		System.out.println("*******************");
		System.out.println(++i);// i = i+1 -> i = 11
		System.out.println(++j);// j = j+1 ->j = 6
		System.out.println(i++);// i = i+1 -> i = 12 but printing 11
		System.out.println(j++);// j = j+1 -> j = 7 but printing 6
	    System.out.println(++i);// i = i+1 -> i = 13
		System.out.println(j++);// j = j+1 -> j = 8 but printing 7
		System.out.println(i++);// i = i+1 -> i = 14 but printing 13
		System.out.println(j++);// j = j+1 -> j = 9 but printing 8
		
		
		System.out.println("i value : " + i);
		System.out.println("j value : " + j);
		

	}

}
