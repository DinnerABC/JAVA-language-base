package com.java.buyBook;

public class OrderItem {
	private Book book;
	private int num;
	
	public OrderItem(Book book,int num){
		this.book=book;
		this.num=num;
	}
	
	public int getNum() {
		return num;
	}
	
	public Book getBook() {
		return book;
	}
	
}
