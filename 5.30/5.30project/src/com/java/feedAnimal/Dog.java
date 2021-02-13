package com.java.feedAnimal;

public class Dog extends Animal {
	public void eat(Bone bone){
		eat();
		System.out.println(this+"Ï²»¶³Ô"+bone);
	}
	public String toString(){
		return "Dog";
	}
}
