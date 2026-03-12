package com.javafundamentalmethodsconstructors;

class Animal1 {
	String name;
	int age;

	public Animal1() {
		System.out.println("Animal one no-arg constructtor called ! ");                                                        

	}

}

class Monkey extends Animal1 {

	public Monkey() {
		super();
		System.out.println("Moneky no-arg constructor called !!");
	}

}

public class Cat1 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		Monkey m = new Monkey();

		System.out.println("main method ended !!");
	}

}
