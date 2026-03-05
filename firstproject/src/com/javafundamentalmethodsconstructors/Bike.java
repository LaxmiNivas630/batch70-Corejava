package com.javafundamentalmethodsconstructors;

public class Bike {

	String brand;
	String model;
	String color;
	double price;
	double milage;

	Bike(String brand, String model) {
		this(brand, model, 10000.00);
		System.out.println("Two arg constructor called ");

	}

	Bike(String brand, String model, double price, String color) {
		System.out.println("Four-arg constructor called");
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;

	}

	Bike(String brand, String model, double price) {
		this(brand, model, price, "blue");
		System.out.println("Three arg constructor called ");

	}

	Bike(String brand) {
		this(brand, "Unknown");
		System.out.println("one arg constructor called !");
		this.brand = brand;

	}

	Bike() {
		this("Unknown");
		System.out.println("no-arg constructor called from bike");
	}

	public static void main(String[] args) {
		System.out.println("Main method started !! ");

		Bike b1 = new Bike();
		System.out.println(b1.brand);

		Bike b2 = new Bike("RE");
		System.out.println("brand : " + b2.brand);// null
		System.out.println("Model : " + b2.model);

		Bike b3 = new Bike("RE", "Classic");
		b3.show();

		Bike b4 = new Bike("Yamaha", "FZ-s", 300000.00);
		b4.show();

		Bike b5 = new Bike("RE", "Himalaya", 250000.00, "black");
		b5.show();

	}

	void show() {
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
		System.out.println("color of the bike : " + color);
		System.out.println("*************************");
	}
}
