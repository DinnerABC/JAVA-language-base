package com.java.buyBook;

public class Book {
	private int id;
	private String name;
	private double price;
	private int storage;
	
	public Book(int id,String name,double price,int storage){
		this.id=id;
		this.name=name;
		this.price=price;
		this.storage=storage;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getStorage() {
		return storage;
	}
}
