package com.spring.di;

public class CharacterManager1 {
	
	//클래스 내부에서 외부 객체를 직접 생성
	// Manager클래스와 외부 클래스와의 결합력이 강함(= 의존성이 높다)
	
	Warrior warrior = new Warrior();
	Hunter hunter = new Hunter();
	Wizard wizard = new Wizard();
	
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
