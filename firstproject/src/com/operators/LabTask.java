package com.operators;

public class LabTask {

	public static void main(String[] args) {

		int x = 3;
		int y = x << 2 + 1;

		System.out.println("***************");
		System.out.println("print the value y :" + y);

		int a = 8;
		int b = 2;
		int c = a >> b << 1;
		System.out.println("*******************");
		System.out.println("print the c value :" + c);

		System.out.println("*************************");
		System.out.println(1 << 2 << 3);

		int x1 = 5;
		int y1 = (x1 > 3) ? x1++ : ++x1;

		System.out.println(x1 + "  " + y1);

	}

}
