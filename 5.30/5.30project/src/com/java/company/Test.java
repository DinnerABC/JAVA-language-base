package com.java.company;

public class Test {
	public static void main(String[] args) {
		Manager m= new Manager("����","001","����");
		m.printInfo();
		m.computeSalary();
		System.out.println("****************");
		HourlyEmployee he = new HourlyEmployee("����", "055", 30);
		he.printInfo();
		he.setHourPerMonth(170);
		he.computerSalary();
	}
}
