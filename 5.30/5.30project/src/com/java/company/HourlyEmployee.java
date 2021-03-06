package com.java.company;

public class HourlyEmployee extends Employee{
	
	private double salaryPerHour;
	private int hourPerMonth;
	
	public HourlyEmployee(String name, String no,double salarePerHour) {
		super(name, no);
		this.salaryPerHour=salarePerHour;
	}
	public void setHourPerMonth(int hourPerMonth) {
		this.hourPerMonth = hourPerMonth;
	}
	public void computerSalary(){
		if(this.hourPerMonth<160){
			setSalary(salaryPerHour * this.hourPerMonth);
		}else{
			setSalary((this.salaryPerHour* (hourPerMonth-160)*1.5)+(160*this.salaryPerHour));
		}
		System.out.println("工作时长为："+hourPerMonth+"\n工资为："+getSalary());
	}
	public void printInfo(){
		super.printInfo();
		System.out.println("工种：计时工");
	}
}
