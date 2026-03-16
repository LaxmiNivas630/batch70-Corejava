package com.operators;

class Vehicle {
	String brand;

	public Vehicle(String brand) {
		this.brand = brand;

	}

	void start(Vehicle v) {
		System.out.println("Brand of the Vehicle : " + brand);
	}

}

class Car extends Vehicle {
	String model;
	double price;

	public Car(String brand, String model, double price) {
		super(brand);
		this.model = model;
		this.price = price;
	}

	void start() {
		System.out.println("Model of the vehicle : " + model);
		System.out.println("Price of the Vehicle : " + price + "cr");
	}

}

public class Driver {

	public static void main(String[] args) {
		Car c = new Car("Range Rover", "Autobiograpy", 2.93);
		c.start((Vehicle) c);
		c.start();

	}

}
