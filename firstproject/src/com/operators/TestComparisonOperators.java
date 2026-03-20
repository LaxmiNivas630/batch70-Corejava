package com.operators;

// == vs equal method
//Comparison Operators : == < <=  > >= !=
// All Comparison Operators will give the result of below of boolean values
//WhenEver we have primitive data types, == operator checks the content, if the content is same it will return the same.

//When we are working with object with object data types,
//==Operators not checks the content and it check the address of the object.

public class TestComparisonOperators {

	public static void main(String[] args) {
		
		
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 200;
		Integer i4 = 200;
		
	System.out.println(i1 == i2);
	System.out.println(i3 ==i4);
		
	System.out.println("*****************************************");
//		String Literals are storing into String Constant Pool
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2);//true
		
//		String Object with new keyword
		String s3 = new String("Nivas");
		String s4 = new String("Nivas");
		System.out.println(s3 == s4);//false
		System.out.println(s3.equals(s4));
		System.out.println(s3.equalsIgnoreCase(s4));
		
		
		System.out.println("**************************");
		int i = 10;
	    int 	j = 10;
		
	    System.out.println(i == j);//true
	    
	    float f1 = 10.5F;
	    double f2 = 10.5;
	    
	   System.out.println(f1 == f2);//true
	   
	   char c = 'A';
	   int c1 = (char)65;
	   System.out.println(c == c1);//true

	}

}
