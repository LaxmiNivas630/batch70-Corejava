package com.javafundamentalmethodsconstructors;

public class Car {

	String model;
	String brand;
	double price;
	String color;

//	parameterized constructor
	Car(String model, String brand, double price, String color) {
		System.out.println("parameterized constructor called");
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
//	no-arg constructor 
	Car(){
		
	}

	public static void main(String[] args) {
		System.out.println("main method started ! ");

		Car c1 = new Car("Suzuki", "kia", 1300000.00, "red");
		c1.carInfo();

		Car c2 = new Car();  //CE
		c2.carInfo();

		System.out.println("main method ended !! ");
 
	}

	void carInfo() {
		System.out.println("Model of the car : " + model);
		System.out.println("brand of the car : " + brand);
		System.out.println("price of the car : " + price);
		System.out.println("color of the car : " + color);

		
	}
}
