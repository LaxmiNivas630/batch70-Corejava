package com.javafundamentalmethodsconstructors;

class GrandParent {

	void display() {
		System.out.println("Grand Parent class called");

	}

}

class Parent extends GrandParent {
	void display() {

		System.out.println(" Parent Class called");

		super.display();
	}
}

class Child extends Parent {
	void display() {

		System.out.println("Child Class called");
		super.display();

	}
}

public class Family {

	public static void main(String[] args) {

		Child c1 = new Child();
		c1.display();

		System.out.println("**********************************************");

		GrandParent g1 = new GrandParent();
		g1.display();

	}

}
