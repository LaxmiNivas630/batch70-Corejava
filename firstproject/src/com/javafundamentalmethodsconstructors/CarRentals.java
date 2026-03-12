package com.javafundamentalmethodsconstructors;

import java.util.Scanner;

public class CarRentals {

	static void welcome() {
		System.out.println("welcome to the Car Rentals !");

	}

	double dailyPrice() {
		return 1000;

	}

	double carOfTheInsurance() {
		return 500;
	}

	double tripCost(int days) {
		double totaltripcost = days * dailyPrice();
		return totaltripcost;

	}

	public static void main(String[] args) {
		System.out.println("main method started !");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		CarRentals c1 = new CarRentals();
		
		welcome();
		
		System.out.println(c1.dailyPrice());
		System.out.println(c1.tripCost(n));
		System.out.println(c1.carOfTheInsurance());
		System.out.println(c1.carOfTheInsurance()+c1.tripCost(n));
		
		
		System.out.println("main method ended !!");
		
		
		
		

	}

}
