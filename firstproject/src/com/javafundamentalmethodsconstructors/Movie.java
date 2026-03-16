package com.javafundamentalmethodsconstructors;

public class Movie {

	String hero;
	String heroine;
	String director;
	double budget;
	String MovieName;
	String producer;

	Movie() {
		System.out.println("No-arg constructor called ! ");
	}

	Movie(String producer, String director) {
		this();
		System.out.println("Parameterized-1 constructor called ! ");
		this.producer = producer;
		this.director = director;
	}

	Movie(Movie m, String hero, double budget) {
		this(m.producer, m.director);
		System.out.println("Parameterized-2 constructor called ! ");
		this.hero = hero;
		this.budget = budget;
		
	}

	Movie(Movie m, String heroine, String MovieName) {
		this(m,m.hero, m.budget);
		System.out.println("Parameterized-3 constructor called ");
		this.heroine = heroine;
		this.MovieName = MovieName;

	}

	public static void main(String[] args) {
		System.out.println("Main method started ! ");

		Movie m1 = new Movie();
		m1.showDetails();

		Movie m2 = new Movie("Gulsan Kumar", "Sandeep Reedy Vanga");
		m2.showDetails();

		Movie m3 = new Movie(m2, "India's Biggest Super Star ", 40000000.00);
		m3.showDetails();

		Movie m4 = new Movie(m3, "Tripti Dimri", "SPRIT");
		m4.showDetails();

		System.out.println("Main method ended !! ");

	}

	void showDetails() {
		System.out.println("Name of the Hero : " + hero);
		System.out.println("Name of the Heroine : " + heroine);
		System.out.println("Name of the Movie : " + MovieName);
		System.out.println("Name of the Producer: " + producer);
		System.out.println("Name of the Director: " + director);
		System.out.println("Budget of the Movie : " + budget);
		System.out.println("*********************************************");
	}

}
