package com.patgame;

import java.util.Scanner;

public class Operation {
	private int op;
	
	public Operation(int op) {
		this.op=op;
	}
	
	public void OperationPat() throws InterruptedException {
		String answer="";
		Cat cat = new Cat();
		Pig pig = new Pig();
		Scanner input = new Scanner(System.in);
		System.out.println("���������Ĳ�����");
		System.out.println("(1)�鿴������Ϣ   (2)������ιʳ  (3)�������ˣ  (4)ϴ��  (0)�˳�");
		
		do {
			int operation=input.nextInt();
			if(operation==1) {
				if(op==1) {
					cat.introduce();
				}else {
					pig.introduce();
				}
			}else if(operation==2) {
				if(op==1) {
					cat.eat();
				}else {
					pig.eat();
				}
			}else if(operation==3) {
				if(op==1) {
					cat.play();
				}else {
					pig.play();
				}
			}else if(operation==4) {
				if(op==1) {
					cat.clear();
				}else {
					pig.clear();
				}
			}else if(operation==0) {
				System.out.println("�Ƿ�Ҫ�˳���ů֮�ң��������ݽ��ᱻɾ������yes/no��");
				answer=input.next();
			}else {
			System.out.println("����������������������");
			}
			System.out.println("������ɣ�");

		}while(!answer.equalsIgnoreCase("yes"));
		
		System.out.print("�����˳���ů֮�ҡ�");
		input.close();
		}
}