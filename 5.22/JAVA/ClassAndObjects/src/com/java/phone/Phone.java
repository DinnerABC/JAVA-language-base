package com.java.phone;

public class Phone {
	String brand;
	String type;
	String os;
	int price;
	int memortSize;
	
	public Phone() {
		
	}
	
	public Phone(String brand,String type,String os,int price,int memortSize){
		this.brand=brand;
		this.type=type;
		this.os=os;
		this.price=price;
		this.memortSize=memortSize;
	}
	
	public void about(){
		System.out.println("Ʒ�ƣ�"+brand+"\n�ͺţ�"+type+"\n����ϵͳ��"+os+"\n�۸�"+price+"\n�ڴ棺"+memortSize+"GB");
	}
	
	public void call(int num){
		System.out.println("ʹ���Զ����Ź���");
		String phoneNo="";
		switch(num){
			case 1:
				phoneNo="үү�ĺ�";	break;
			case 2:
				phoneNo="���̵ĺ�";	break;
			case 3:
				phoneNo="�ְֵĺ�";	break;
			case 4:
				phoneNo="����ĺ�";	break;
		}
		System.out.println(phoneNo);
	}
	
	public void playGame(){
		System.out.println("���������Ϸ��");
	}
	
	public void downloadMusic(String song){
		System.out.println(song+"��ʼ���ء�");
		System.out.println(song+"������ɡ�");
	}
	
	public void playMusic(String song){
		System.out.println(song+"��ʼ���š�");
	}
	
}