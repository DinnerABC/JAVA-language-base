package com.patgame;

import java.util.Scanner;


public class Pig extends Animal{
	//private String name;  //����
	private String sex;  //�Ա�
	//private int strength = 100;  //����ֵ
	//private int mood = 20;  //����ֵ
	//private int clear = 50;  //����ֵ
	//private int level = 1;  //�ȼ�
	//private int experience = 0;  //����ֵ
	
	Scanner input = new Scanner(System.in);
	
	public Pig() {
		
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex() {
		return sex;
	}
	
	public void firstIntroduce() {  //������������
		System.out.println("��ã��װ������ˣ����μ��棬�����գ�");
		System.out.println("�ҵ������ǣ�"+getName()+"����һֻ�ɰ�����"+sex+"Ŷ��");
		System.out.println("�����ҵ�����ֵΪ��"+getStrength()+"������ֵΪ��"+getMood()+"��Ŀǰ�ȼ�Ϊ��"+getLevel()+",Ҫ�ú��չ���Ŷ");
	}
	
	public void introduce() {   //��ѯĿǰ��Ϣ
		System.out.println("Ŀǰ�ҵ�����ֵΪ��"+getStrength()+"������ֵΪ��"+getMood()+"��Ŀǰ�ȼ�Ϊ��"+getLevel()+",Ҫ�����ú��չ���Ŷ");
	}
	
	public void eat() throws InterruptedException {  //�ԡ���ʱ����
		if(getStrength()>=120) {
			System.out.println("���Ѿ��Ա��ˣ���Ҫ���˶���Ŷ��");
		}else {
			setStrength(getStrength() + 20);
			setExperience(getExperience() +5);
			setMood(getMood() +5);
			Thread.currentThread();
			System.out.println("����ιʳ����");
			Thread.sleep(3000);
			System.out.println("��������");
			System.out.println("����ֵ+20������ֵ+5������ֵ+5");
			System.out.println("Ŀǰ�ҵ�����ֵΪ��"+getStrength());
		}
	}
	
	public void play() throws InterruptedException {  //�桢��ʱ����
		if(getStrength()<=30) {
			System.out.print(getName()+"�����ˣ���������ˣ��");
		}else {
			setStrength(getStrength()-10);
			setMood(getMood()+10);
			setExperience(getExperience()+5);
			System.out.println(getName()+" ���ڸ�������ˣ�������ã�");
			Thread.currentThread();
			Thread.sleep(2000);
			System.out.println("����ֵ+10������ֵ+5������ֵ-10");
			System.out.println("Ŀǰ�ҵ�����ֵΪ��"+getMood()+"������ֵΪ��"+getStrength());
		}
	}
	
	public void clear() throws InterruptedException {
		if(getClear()<=20) {
			System.out.print(getName()+"���ں���Ŷ����Ҫϴ����");
		}else if(getClear()>=110) {
			System.out.print(getName()+"���ڸɸɾ���������Ҫϴ����Ŷ");
		}else {
			System.out.println("��ѡ��ϴ����Ʒ��");
			System.out.println("(1)Ʈ�Ụ��ϴ��ˮ  (2)���������  (3)ǿ��Ӥ����ʪ˪");
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
						System.out.println("���������룡");
				}
			}while(incorrect==1);
			setStrength(getStrength()-5);
			setMood(getMood()+5);
			setExperience(getExperience()+10);

			System.out.println(getName()+" ����ϴ�裬��ɾ���Ŷ��");
			Thread.currentThread();
			Thread.sleep(2000);
			System.out.println("����ֵ+10������ֵ+5�����ֵ+"+moodvalue+"������ֵ-10");
			System.out.println(getName()+"������ֵΪ��"+getMood()+"������ֵΪ��"+getStrength()+"���ֵΪ��"+getClear());
		}
	}
}
	
