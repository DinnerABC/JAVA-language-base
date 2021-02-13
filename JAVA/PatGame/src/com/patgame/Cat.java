package com.patgame;

//import java.util.Timer;
//import java.util.TimerTask;
import java.util.Scanner;


public class Cat extends Animal{
	//private String name;  //����
	private String strain;  //���
	//private int strength = 100;  //����ֵ
	//private int mood = 20;  //����ֵ
	//private int clear = 50;
	//private int level = 1;  //�ȼ�
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
	
	public void firstIntroduce() {    //��һ����������
		System.out.println("��ã��װ������ˣ����μ��棬�����գ�");
		System.out.println("�ҵ������ǣ�"+getName()+"����һֻ"+strain+"Ŷ");
		System.out.println("�����ҵ�����ֵΪ��"+getStrength()+"������ֵΪ��"+getMood()+"���ֵΪ��"+getClear()+"��Ŀǰ�ȼ�Ϊ��"+getLevel()+",Ҫ�ú��չ���Ŷ");
	}
	
	public void introduce() {   //��ѯ������Ϣ
		System.out.println("Ŀǰ�ҵ�����ֵΪ��"+getStrength()+"������ֵΪ��"+getMood()+"��Ŀǰ�ȼ�Ϊ��"+getLevel()+",Ҫ�����ú��չ���Ŷ");
	}
	
	public void eat() throws InterruptedException {   //�Եļ���ʱ����

		if(getStrength()>=120) {
			System.out.println("���Ѿ��Ա��ˣ���Ҫ���˶���Ŷ��");
		}else {
			setStrength(getStrength() + 20);
			setMood(getMood() + 5);
			setClear(getClear() - 2);
			Thread.currentThread();
			System.out.println("����ιʳ����");
			Thread.sleep(3000);    //��ʱ���������ڳ�
			System.out.println("��������");
			System.out.println("����ֵ+20������ֵ+5�����ֵ-2������ֵ+5");
			System.out.println("Ŀǰ�ҵ�����ֵΪ��"+getStrength());
		}
	}
	
	public void play() throws InterruptedException {   //��ˣ����ʱ����
		if(getStrength()<=30) {
			System.out.print(getName()+"�����ˣ���������ˣ��");
		}else {
			setStrength(getStrength() - 10);
			setMood(getMood() + 10);
			setClear(getClear() - 15);
			System.out.println(getName()+" ���ڸ�������ˣ�������ã�");
			Thread.currentThread();
			Thread.sleep(2000);
			System.out.println("����ֵ+10������ֵ+5�����ֵ-15������ֵ-10");
			System.out.println(getName()+"������ֵΪ��"+getMood()+"������ֵΪ��"+getStrength()+"����ֵΪ��"+getClear());
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
						System.out.println("���������룡");
				}
			}while(incorrect==1);
			setStrength(getStrength() - 5);
			setMood(getMood() + 5);

			System.out.println(getName()+" ����ϴ�裬��ɾ���Ŷ��");
			Thread.currentThread();
			Thread.sleep(2000);
			System.out.println("����ֵ+10������ֵ+5�����ֵ+"+moodvalue+"������ֵ-10");
			System.out.println(getName()+"������ֵΪ��"+getMood()+"������ֵΪ��"+getStrength()+"���ֵΪ��"+getClear());
		}
	}
}