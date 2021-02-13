package com.java.vote;

import java.util.HashSet;
import java.util.Set;

public class Voter {
	private static final int MAX_COUNT=100;
	private static int count;
	
	private static Set<Voter>voters=new HashSet<Voter>();
	private String name;
	private String answer;
	
	public Voter(String name){
		this.name=name;
	}
	
	public void voterFor(String answer){
		if(count==MAX_COUNT){
			System.out.println("ͶƱ������");
			return;
		}
		if(voters.contains(this))
			System.out.println(name+"�㲻�����ظ�ͶƱ");
		else{
			this.answer=answer;
			count++;
			voters.add(this);
			System.out.println(name+"��л��ͶƱ");
		}
	}
	
	public static void printResult(){
		System.out.println("��ǰƱ��Ϊ��"+count);
		System.out.println("����ͶƬ��ѡ��ͽ�����£�");
		for(Voter Voter:voters){
			System.out.println(Voter.name+"�����"+Voter.answer);
		}
	}
	
	public static void main(String[] args){
		Voter tom=new Voter("Tom");
		Voter jack=new Voter("Jack");
		Voter mike=new Voter("Mike");
		
		tom.voterFor("��");
		tom.voterFor("��");
		jack.voterFor("��");
		mike.voterFor("��");
		Voter.printResult();
	}
}