package com.javafundamentalmethodsconstructors;

public class Bike1 {

	String brand;
	String model;
	String color;
	double price;
	double milage;
	
	Bike1(String brand, String model,double price) {
		System.out.println("three-arg constructor called !!");
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	Bike1(String brand, String model) {
		System.out.println("two-arg constructor called !!");
		this.brand = brand;
		this.model = model;
	}

	Bike1(String brand) {
		this(brand,"Unknown");
		System.out.println("one arg constructor called !!");
		this.brand = brand;

	}

	Bike1() {
		this("Unknown");
		System.out.println("no-arg constructor called from Bike");
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		Bike1 b1 = new Bike1();
		System.out.println(b1.brand);

//		Bike1 b2 = new Bike1("RE");
//		System.out.println("Brand : " + b2.brand);// null
//		System.out.println("Model : " + b2.model);

//		Bike1 b3 = new Bike1("RE", "Classic");
//		System.out.println("brand : " + b3.brand);
//		System.out.println("Model : " + b3.model);
//		
//		Bike1 b4 = new Bike1("yamaha","FZ-s",200000.00);
//		System.out.println("brand : " + b4.brand);
//		System.out.println("Model : " + b4.model);
//		System.out.println("price : " + b4.price);
//		
//	
	}

}
