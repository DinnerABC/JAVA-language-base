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
		System.out.println("品牌："+brand+"\n型号："+type+"\n操作系统："+os+"\n价格："+price+"\n内存："+memortSize+"GB");
	}
	
	public void call(int num){
		System.out.println("使用自动拨号功能");
		String phoneNo="";
		switch(num){
			case 1:
				phoneNo="爷爷的号";	break;
			case 2:
				phoneNo="奶奶的号";	break;
			case 3:
				phoneNo="爸爸的号";	break;
			case 4:
				phoneNo="妈妈的号";	break;
		}
		System.out.println(phoneNo);
	}
	
	public void playGame(){
		System.out.println("玩猜数字游戏。");
	}
	
	public void downloadMusic(String song){
		System.out.println(song+"开始下载…");
		System.out.println(song+"下载完成。");
	}
	
	public void playMusic(String song){
		System.out.println(song+"开始播放。");
	}
	
}
