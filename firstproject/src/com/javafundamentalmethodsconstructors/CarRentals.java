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

		CarRentals c1 = new CarRentals();

		welcome();

		System.out.println("Perday cost :" + c1.dailyPrice());

		Scanner sc = new Scanner(System.in);
		System.out.println("Total No. Of days");
		int n = sc.nextInt();

		System.out.println("Cost : " + c1.tripCost(n));
		System.out.println("Car Insurance Amount : " + c1.carOfTheInsurance());
		System.out.println("Total Amount : " + (c1.carOfTheInsurance() + c1.tripCost(n)));

		System.out.println("main method ended !!");

	}

}
