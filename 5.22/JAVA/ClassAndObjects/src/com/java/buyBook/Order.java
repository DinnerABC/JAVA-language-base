package com.java.buyBook;

public class Order {
	private String orderId;
	private OrderItem items[];
	private double total;
	
	public Order(String orderId){
		this.orderId=orderId;
		this.items=new OrderItem[3];
	}
	
	public String getOrderId() {
		return orderId;
	}
	
	public OrderItem[] getItems() {
		return items;
	}
	
	public double getTotal() {
		calTotal();
		return total;
	}
	
	public void setItem(OrderItem item,int i) {
		this.items[i] = item;
	}
	
	public void calTotal(){
		double total=0;
		for(int i=0;i<items.length;i++){
			total+=items[i].getNum() * items[i].getBook().getPrice();
		}
		this.total=total;
	}
}
