package com.patgame;

import java.util.Scanner;


public class Pig extends Animal{
	//private String name;  //名称
	private String sex;  //性别
	//private int strength = 100;  //体力值
	//private int mood = 20;  //心情值
	//private int clear = 50;  //心情值
	//private int level = 1;  //等级
	//private int experience = 0;  //经验值
	
	Scanner input = new Scanner(System.in);
	
	public Pig() {
		
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	
	public void firstIntroduce() {  //初次领养介绍
		System.out.println("你好，亲爱的主人！初次见面，请多关照！");
		System.out.println("我的名字是："+getName()+"，是一只可爱的猪"+sex+"哦！");
		System.out.println("现在我的体力值为："+getStrength()+"，心情值为："+getMood()+"，目前等级为："+getLevel()+",要好好照顾我哦");
	}
	
	public void introduce() {   //查询目前信息
		System.out.println("目前我的体力值为："+getStrength()+"，心情值为："+getMood()+"，目前等级为："+getLevel()+",要继续好好照顾我哦");
	}
	
	public void eat() throws InterruptedException {  //吃、延时功能
		if(getStrength()>=120) {
			System.out.println("我已经吃饱了，需要多运动了哦！");
		}else {
			setStrength(getStrength() + 20);
			setExperience(getExperience() +5);
			setMood(getMood() +5);
			Thread.currentThread();
			System.out.println("正在喂食……");
			Thread.sleep(3000);
			System.out.println("吃完啦！");
			System.out.println("体力值+20，心情值+5，经验值+5");
			System.out.println("目前我的体力值为："+getStrength());
		}
	}
	
	public void play() throws InterruptedException {  //玩、延时功能
		if(getStrength()<=30) {
			System.out.print(getName()+"生病了，快点跟我玩耍！");
		}else {
			setStrength(getStrength()-10);
			setMood(getMood()+10);
			setExperience(getExperience()+5);
			System.out.println(getName()+" 正在跟主人玩耍，心情变好！");
			Thread.currentThread();
			Thread.sleep(2000);
			System.out.println("心情值+10，经验值+5，体力值-10");
			System.out.println("目前我的心情值为："+getMood()+"，体力值为："+getStrength());
		}
	}
	
	public void clear() throws InterruptedException {
		if(getClear()<=20) {
			System.out.print(getName()+"现在好脏哦，想要洗澡了");
		}else if(getClear()>=110) {
			System.out.print(getName()+"现在干干净净，不需要洗澡了哦");
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
						setMood(getMood()+moodvalue);
						break;
					case 2:
						moodvalue=40;
						setMood(getMood()+moodvalue);
						break;
					case 3:
						moodvalue=20;
						setMood(getMood()+moodvalue);
						break;
					default:
						incorrect=1;
						System.out.println("请重新输入！");
				}
			}while(incorrect==1);
			setStrength(getStrength()-5);
			setMood(getMood()+5);
			setExperience(getExperience()+10);

			System.out.println(getName()+" 正在洗澡，变干净了哦！");
			Thread.currentThread();
			Thread.sleep(2000);
			System.out.println("心情值+10，经验值+5，清洁值+"+moodvalue+"，体力值-10");
			System.out.println(getName()+"的心情值为："+getMood()+"，体力值为："+getStrength()+"清洁值为："+getClear());
		}
	}
}
	

