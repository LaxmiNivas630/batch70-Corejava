package com.javafundamentalmethodsconstructors;

public class ObjectCounter {
	
	static int c = 0;

	ObjectCounter() {
		c++;
	}

	public static void main(String[] args) {

		ObjectCounter N = new ObjectCounter();
		ObjectCounter N1 = new ObjectCounter();
		ObjectCounter R = new ObjectCounter();
				

		System.out.println(" Number of Objects are created = " + c);
		
	}

}
