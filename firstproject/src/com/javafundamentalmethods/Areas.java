package com.javafundamentalmethods;

import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base =");
		double base = sc.nextDouble();

		System.out.println("Enter the height =");
		float height = sc.nextFloat();
		
		double artri = findAreaOfTriangle( base,height);
		System.out.println("Area of Triangle is : " + artri);
		sc.close();
		
	}

	static double findAreaOfTriangle(double b, double h) {
		double artri = 0.5 * b * h;
		return artri;

	}

}
