package com.spring.di;

public class CharacterManager2 {
	
	Warrior warrior;
	Hunter hunter;
	Wizard wizard;
	
	//기본 생성자
	public CharacterManager2() {}
	
	//방법1) 생성자를 통하여 외부 객체 주입
	//		 Manager클래스와 외부 클래스와의 결합력이 약함(= 의존성이 낮다)
	public CharacterManager2(Warrior warrior) {
		this.warrior = warrior;
	}
	
	public CharacterManager2(Hunter hunter) {
		this.hunter = hunter;
	}
	
	public CharacterManager2(Wizard wizard) {
		this.wizard = wizard;
	}
	
	//방법2) setter 메소드를 통하여 외부 객체 주입
	//	 	 Manager클래스와 외부 클래스와의 결합력이 약함(= 의존성이 낮다)
	public Warrior getWarrior() {
		return warrior;
	}

	public void setWarrior(Warrior warrior) {
		this.warrior = warrior;
	}

	public Hunter getHunter() {
		return hunter;
	}

	public void setHunter(Hunter hunter) {
		this.hunter = hunter;
	}

	public Wizard getWizard() {
		return wizard;
	}

	public void setWizard(Wizard wizard) {
		this.wizard = wizard;
	}
	
	//Print
	void princCharacter1Info() {
		System.out.println(warrior.getOccupation() + "/" + warrior.getLevel());
	}
	
	void princCharacter2Info() {
		System.out.println(hunter.getOccupation() + "/" + hunter.getLevel());
	}
	
	void princCharacter3Info() {
		System.out.println(wizard.getOccupation() + "/" + wizard.getLevel());
	}

}
