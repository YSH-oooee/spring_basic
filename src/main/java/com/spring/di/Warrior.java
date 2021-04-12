package com.spring.di;

/*
	# POJO (Plain Old Java Object) 
	
	- EJB 등에서 사용되는 Java Bean이 아닌 Getter 와 Setter 로 구성된 가장 순수한 형태의 기본 클래스 
	- Spring에서 핵심적인 부분을 구성하는 가장 기본적인 요소로 사용
*/

public class Warrior {
	
	private String occupation = "전사";
	private int level = 1;
	private int power = 10;
	private int dex = 5;
	private int mana = 5;
	
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getDex() {
		return dex;
	}
	public void setDex(int dex) {
		this.dex = dex;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}

}