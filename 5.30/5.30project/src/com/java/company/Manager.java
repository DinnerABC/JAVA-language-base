package com.java.company;

public class Manager extends Employee{
	private String level;
	
	public Manager(String name, String no,String level) {
		super(name, no);
		this.level=level;
	}
	
	public void computeSalary(){
		if(level.equals("经理")){
			setSalary(10000);
		}else if(level.equals("副经理")){
			setSalary(6000);
		}else if(level.equals("车间主任")){
			setSalary(4000);
		}else{
			setSalary(3000);
		}
		System.out.println("工资"+getSalary());
	}
	
	public void printInfo(){
		super.printInfo();System.out.println("职位："+level);
	}


	
}
