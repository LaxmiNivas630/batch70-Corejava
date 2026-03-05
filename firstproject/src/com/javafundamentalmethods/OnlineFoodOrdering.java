package com.javafundamentalmethods;

import java.util.Scanner;

public class OnlineFoodOrdering {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Item price");
		double itemprice = sc.nextDouble();

		System.out.println("Enter item Quantity");
		int quantity = sc.nextInt();
		double totalprice = calculateItemTotal(itemprice, quantity);
		sc.close();

	}

	static double calculateItemTotal(double price, int quantity) {
		double itemtotal = price * quantity;
		System.out.println("After added the Quantity + price = " + itemtotal);
		addGST(itemtotal);
		return itemtotal;

	}

	static double addGST(double amount) {
		double gst = (amount * 10 / 100 + amount);
		System.out.println("After Adding the GST = " + gst);
		addDeliveryCharge(gst);
		return gst;
	}

	static double addDeliveryCharge(double dcharges) {
		double dc = dcharges + 50;
		System.out.println("After Adding the Delivery charges = " + dc);
		printBill(dc);

		return dc;

	}

	static void printBill(double finalAmount) {
		System.out.println("Total Bill = " + finalAmount);

	}

}
