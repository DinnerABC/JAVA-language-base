package com.java.Student;

public class Teacher extends Person{
	private String major;
	public Teacher(String name,int age,String sex,String major) {
		super(name, age, sex);
		this.major=major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	
	public void printinfo(){
		System.out.println("����ʤ��"+major+"��,ѧ���ǳ�ϲ������");
	}
}