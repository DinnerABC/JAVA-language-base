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
			System.out.println("投票结束。");
			return;
		}
		if(voters.contains(this))
			System.out.println(name+"你不允许重复投票");
		else{
			this.answer=answer;
			count++;
			voters.add(this);
			System.out.println(name+"感谢你投票");
		}
	}
	
	public static void printResult(){
		System.out.println("当前票数为："+count);
		System.out.println("参与投片的选民和结果如下：");
		for(Voter Voter:voters){
			System.out.println(Voter.name+"意见："+Voter.answer);
		}
	}
	
	public static void main(String[] args){
		Voter tom=new Voter("Tom");
		Voter jack=new Voter("Jack");
		Voter mike=new Voter("Mike");
		
		tom.voterFor("是");
		tom.voterFor("否");
		jack.voterFor("是");
		mike.voterFor("是");
		Voter.printResult();
	}
}
