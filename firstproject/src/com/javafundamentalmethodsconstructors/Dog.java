package com.javafundamentalmethodsconstructors;

class Animal {
	String name = "Puppy";

	void show() {
		System.out.println("Animal " + name);

	}

}

class Cat extends Animal {
	String name = "Sweety";

//	note : this super can use only in instance area but not in static area
	@Override
	void show() {

		System.out.println("Cat " + super.name);
	}
	
//	cannot use super in a static context
//	cannot use this in a static context
//	static void display{
//	System.out.println(super.name)

//	}
}

public class Dog {

	public static void main(String[] args) {
		System.out.println("main method started");

		Cat c = new Cat();
	
		c.show();

		System.out.println("main method ended");

	}

}
