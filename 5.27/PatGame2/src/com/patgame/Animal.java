package com.patgame;

public class Animal {
	private String name;  //����
	private int strength = 100;  //����ֵ
	private int mood = 20;  //����ֵ
	private int clear = 50;
	private int level = 1;  //�ȼ�
	private int experience=0;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getMood() {
		return mood;
	}
	public void setMood(int mood) {
		this.mood = mood;
	}
	public int getClear() {
		return clear;
	}
	public void setClear(int clear) {
		this.clear = clear;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getExperience() {
		return experience;
	}
	
}
