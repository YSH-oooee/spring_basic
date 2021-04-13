package com.spring.di;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DI_Ex01 {
	
	@RequestMapping(value="/diEx01", method = RequestMethod.GET)
	public String main() {
		
		System.out.println("1.클래스 내부에서 외부 객체를 생성한 예시");
		//CharacterManager1을 생성하는 순간, 내부에서 Warrior, Hunter, Wizard도 생성
		CharacterManager1 cm1 = new CharacterManager1();
		
		cm1.princCharacter1Info();
		cm1.princCharacter2Info();
		cm1.princCharacter3Info();
		
		
		System.out.println("2.생성자를 통하여 외부 객체를 주입한 예시");
		//CharacterManager2를 생성하면서 각 내부의 (외부)클래스들도 생성해줘야 함
		CharacterManager2 cm2 = new CharacterManager2(new Warrior());
		cm2.princCharacter1Info();
		
		cm2 = new CharacterManager2(new Hunter());
		cm2.princCharacter2Info();
		
		cm2 = new CharacterManager2(new Wizard());
		cm2.princCharacter3Info();
		
		System.out.println("3.setter를 통하여 외부 객체를 주입한 예시");
		
		cm2 = new CharacterManager2();
		cm2.setWarrior(new Warrior());
		cm2.princCharacter1Info();
		
		cm2 = new CharacterManager2();
		cm2.setHunter(new Hunter());
		cm2.princCharacter2Info();
		
		cm2 = new CharacterManager2();
		cm2.setWizard(new Wizard());
		cm2.princCharacter3Info();
		
		return "home";
		
	}

}
