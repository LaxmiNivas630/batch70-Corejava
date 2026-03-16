package com.javafundamental;

public class CommandLineArgument {

	public static void main(String[] names){
		System.out.println("main method started");
		
		int i = Integer.parseInt(names[0]);
		int i1 = Integer.parseInt(names[1]);
		
		System.out.println(i+i1);
		
//		System s = new System();
//        String = new String();
		
		for(String n : names) {
			System.out.println(n);
			
		}

	}

}
