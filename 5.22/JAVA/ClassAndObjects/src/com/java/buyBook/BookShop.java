package com.java.buyBook;

import java.util.Scanner;

public class BookShop {

	public static void main(String[] args) {
		Book books[]=new Book[3];
		
		outBooks(books);
		Order order=purchase(books);
		outOrder(order);
	}
	
	public static Order purchase(Book books[]){
		Order order=new Order("00001");
		OrderItem item=null;
		Scanner in=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("������ͼ����ѡ��ͼ�飺");
			int cno=in.nextInt();
			System.out.println("�����빺��ͼ���������");
			int pnum=in.nextInt();
			item=new OrderItem(books[cno-1], pnum);
			order.setItem(item,i);
			System.out.println("���������ͼ�顣");
		}
		in.close();
		return order;
	}
	
	public static void outOrder(Order order){
		System.out.println("\n\tͼ�鶩��");
		System.out.println("ͼ�鶩���ţ�"+order.getOrderId());
		System.out.println("ͼ������\t\t��������\tͼ�鵥��");
		System.out.println("------------------------------------");
		OrderItem items[]=order.getItems();
		for(int i=0;i<items.length;i++){
			System.out.println(items[i].getBook().getName()+"\t"+items[i].getNum()+"\t"+items[i].getBook().getPrice());
		}
		System.out.println("------------------------------------");
		System.out.println("�����ܶ\t\t"+order.getTotal());
	}
	
	public static void outBooks(Book books[]){
		books[0]=new Book(1,"JAVA�̳�",30.6,30);
		books[1]=new Book(2,"JSPָ��",42.1,40);
		books[2]=new Book(3,"ssh����",47.3,15);
		System.out.println("\tͼ���б�");
		System.out.println("ͼ����\tͼ������\t\tͼ�鵥��\t�������");
		System.out.println("------------------------------------");
		for(int i=0;i<books.length;i++){
			System.out.println(i+1+"\t"+books[i].getName()+"\t"+books[i].getPrice()+"\t"+books[i].getStorage());
		}
		System.out.println("------------------------------------");
	}
}
