package com.javafundamental;

public class SalaryBonus {
	int eid;
	String ename;
	long esal;

	public static void main(String[] args) {
		System.out.println("First Employee Details");
		SalaryBonus E3 = new SalaryBonus();
		E3.main1();

	}

	public void main1() {
		SalaryBonus E1 = new SalaryBonus();
		E1.eid = 422;
		E1.ename = "Sonu";
		E1.esal = 50000;

		System.out.println(E1.eid);
		System.out.println(E1.ename);
		System.out.println(E1.esal);
		E1.bonus();

	}

	void bonus() {
		double bonus = esal + (esal * 0.2);
		System.out.println("Bonus=" + bonus);
	}

}
