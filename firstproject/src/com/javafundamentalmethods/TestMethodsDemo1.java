 package com.javafundamentalmethods;

//1) no argument + no return type
public class TestMethodsDemo1 {

	// instance method
	// no argument + no return type
	void greet() {
		System.out.println("Good morning, Have great a day !");
	}
	
	static void welcome() {
		System.out.println("welcome to methods !");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

//   Cannot make a static reference to the non-static method greet() from the type TestMethodsDemo1.
//   greet(); // calling the method

//   if we want to call instance methods inside a static,
//   we must need to create an object of a class and we can call by using object reference variable.

		TestMethodsDemo1 t1 = new TestMethodsDemo1();
		t1.greet();
		
		// static methods we can call directly 
		//And also we can by using name 
		welcome();
		TestMethodsDemo1.welcome();
//The static method welcome() from the type TestMethodsDemo1 should be accessed in a static way
		t1.welcome();
		
		System.out.println(" main method ended !");
	}

}
