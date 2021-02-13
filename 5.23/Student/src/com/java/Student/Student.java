package com.java.Student;

public class Student extends Person {
	private String course;
	public Student(String name,int age,String sex,String course) {
		super(name, age, sex);
		this.course=course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	public String getCourse() {
		return course;
	}
	
	public void printinfo(){
		
		System.out.println("我正在上"+course+"课,这门课非常有意思。");
	}
}
