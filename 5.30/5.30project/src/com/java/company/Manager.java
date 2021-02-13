package com.java.company;

public class Manager extends Employee{
	private String level;
	
	public Manager(String name, String no,String level) {
		super(name, no);
		this.level=level;
	}
	
	public void computeSalary(){
		if(level.equals("����")){
			setSalary(10000);
		}else if(level.equals("������")){
			setSalary(6000);
		}else if(level.equals("��������")){
			setSalary(4000);
		}else{
			setSalary(3000);
		}
		System.out.println("����"+getSalary());
	}
	
	public void printInfo(){
		super.printInfo();System.out.println("ְλ��"+level);
	}


	
}
