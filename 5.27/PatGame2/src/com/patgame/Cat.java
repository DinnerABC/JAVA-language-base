package com.patgame;

//import java.util.Timer;
//import java.util.TimerTask;
import java.util.Scanner;


public class Cat extends Animal{
	//private String name;  //名称
	private String strain;  //类别
	//private int strength = 100;  //体力值
	//private int mood = 20;  //心情值
	//private int clear = 50;
	//private int level = 1;  //等级
	//private int experience=0;
	
	Scanner input = new Scanner(System.in);
	
	public Cat() {
		
	}
	
	public void setStrain(String strain) {
		this.strain = strain;
	}
	public String getStrain() {
		return strain;
	}
	
	public void firstIntroduce() {    //第一次领养介绍
		System.out.println("你好，亲爱的主人！初次见面，请多关照！");
		System.out.println("我的名字是："+getName()+"，是一只"+strain+"哦");
		System.out.println("现在我的体力值为："+getStrength()+"，心情值为："+getMood()+"清洁值为："+getClear()+"，目前等级为："+getLevel()+",要好好照顾我哦");
	}
	
	public void introduce() {   //查询宠物信息
		System.out.println("目前我的体力值为："+this.getStrength()+"，心情值为："+this.getMood()+"，目前等级为："+this.getLevel()+",要继续好好照顾我哦");
	}
	
	public void eat() throws InterruptedException {   //吃的加延时功能

		if(getStrength()>=120) {
			System.out.println("我已经吃饱了，需要多运动了哦！");
		}else {
			setStrength(getStrength() + 20);
			setMood(getMood() + 5);
			setClear(getClear() - 2);
			Thread.currentThread();
			System.out.println("正在喂食……");
			Thread.sleep(3000);    //延时，体现正在吃
			System.out.println("吃完啦！");
			System.out.println("体力值+20，心情值+5，清洁值-2，经验值+5");
			System.out.println("目前我的体力值为："+getStrength());
		}
	}
	
	public void play() throws InterruptedException {   //玩耍，延时功能
		if(getStrength()<=30) {
			System.out.print(this.getName()+"生病了，快点跟我玩耍！");
		}else {
			setStrength(getStrength() - 10);
			setMood(getMood() + 10);
			setClear(getClear() - 15);
			System.out.println(this.getName()+" 正在跟主人玩耍，心情变好！");
			Thread.currentThread();
			Thread.sleep(2000);
			System.out.println("心情值+10，经验值+5，清洁值-15，体力值-10");
			System.out.println(this.getName()+"的心情值为："+this.getMood()+"，体力值为："+this.getStrength()+"心情值为："+this.getClear());
		}
	}
	
	public void clear() throws InterruptedException {
		if(getClear()<=20) {
			System.out.print(this.getName()+"现在好脏哦，想要洗澡了");
		}else if(getClear()>=110) {
			System.out.print(this.getName()+"现在干干净净，不需要洗澡了哦");
		}else {
			System.out.println("请选择洗澡用品：");
			System.out.println("(1)飘柔护理洗发水  (2)舒肤佳香皂  (3)强生婴儿保湿霜");
			int cleartool = input.nextInt();
			int incorrect=0;
			int moodvalue = 0;
			do {	
				switch(cleartool) {
					case 1:
						moodvalue=35;
						setMood(getMood() + moodvalue);
						break;
					case 2:
						moodvalue=40;
						setMood(getMood() + moodvalue);
						break;
					case 3:
						moodvalue=20;
						setMood(getMood() + moodvalue);
						break;
					default:
						incorrect=1;
						System.out.println("请重新输入！");
				}
			}while(incorrect==1);
			setStrength(getStrength() - 5);
			setMood(getMood() + 5);

			System.out.println(this.getName()+" 正在洗澡，变干净了哦！");
			Thread.currentThread();
			Thread.sleep(2000);
			System.out.println("心情值+10，经验值+5，清洁值+"+moodvalue+"，体力值-10");
			System.out.println(this.getName()+"的心情值为："+this.getMood()+"，体力值为："+this.getStrength()+"清洁值为："+this.getClear());
		}
	}
}
