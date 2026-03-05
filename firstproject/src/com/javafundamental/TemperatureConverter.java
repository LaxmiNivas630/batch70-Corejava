package com.javafundamental;

public class TemperatureConverter {

	double cel;
	double fahrenheit;

	public static void main(String[] args) {

		TemperatureConverter t1 = new TemperatureConverter();

		// Assign values
		t1.cel = 40;
		t1.fahrenheit = 104;

		// Call methods
		t1.celsiusToFahrenheit();
		t1.fahrenheitToCelsius();
	}

	// Celsius to Fahrenheit
	public void celsiusToFahrenheit() {
		double f = (cel * 9 / 5) + 32;
		System.out.println("Celsius converts to Fahrenheit: " + f);
	}

	// Fahrenheit to Celsius
	public void fahrenheitToCelsius() {
		double c = (fahrenheit - 32) * 5 / 9;
		System.out.println("Fahrenheit converts to Celsius: " + c);
	}
}
