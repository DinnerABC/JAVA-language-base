package com.java.Student;

public class Demo {

	public static void main(String[] args) {
		Student s=new Student("小明", 20, "男", "JAVA程序设计");
		Teacher t=new Teacher("小华", 30, "女", "电子逻辑设计");

		s.printinfo();
		t.printinfo();
		
	}

}
