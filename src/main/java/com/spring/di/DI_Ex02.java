package com.spring.di;

import org.springframework.context.ApplicationContext;	//interface
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DI_Ex02 {
	
	/*
	# IoC(Inversion of Control)
	
		- IoC(제어권의 역전)이란, 객체의 생성, 생명주기의 관리까지 모든 객체에 대한
		  제어권(개발자→스프링 프레임워크)이 바뀌었다는 것을 의미한다.
		- 스프링 프레임워크에서 객체에 대한 생성 및 연결 및 생명주기를 관리할 수 있는 기능을
		  IoC 컨테이너를 이용하여 제공하고 있다.
		- POJO의 생성, 초기화, 서비스, 소멸에 대한 작업을 처리한다.
	
	
	# 의존성 주입(Dependency Injection)
	
	 	- 각 클래스간의 의존관계를 IoC 컨테이너가 자동으로 연결해주는 것
		- 컨테이너가 흐름의 주체가 되어 애플리케이션 코드에 의존관계를 주입해 주는 것이다.
		- 개발자들은 단지 설정파일에서 의존관계가 필요하다는 정보를 추가하면 된다.
	
		[동작과정]
		1) 구현 클래스의 정보를 xml(설정파일)에 기술 하거나 클래스에 어노테이션을 명시한다. 
		2) Framework( IoC 컨테이너)에서 설정파일을 읽거나 어노테이션을 읽어들인다. 
		3) 구현객체를 생성하며 서로 의존관계가 있는지 확인하여 객체를 연결한다.
	
	 	@Autowired	: 스프링 어노테이션		, 타입에 맞추어서 연결	
	 	@Inject		: 자바 표준 어노테이션	, 타입에 맞추어서 연결	, Dependency추가 이후 사용 가능
	 	@Resource	: 자바 표준 어노테이션	, 이름에 맞추어서 연결
	 */
	
	@RequestMapping(value="/diEx02", method = RequestMethod.GET)
	public String mainString() {
		//읽어 올 xml파일의 경로
		ApplicationContext context = new GenericXmlApplicationContext("classpath:CharacterApplicationContext.xml");
		
		//방법 1)
		//.getBean("bean의 id값", 클래스명.class);
		//CharacterManager2 cm2 = context.getBean("characterManager2", CharacterManager2.class);
		
		//방법 2)
		//.getBaen("bean의 id값"); >> 형변환 주의
		//CharacterManager2 cm2 = (CharacterManager2)context.getBean("characterManager2");
		
		//방법 3)
		//bean이 !유일한! 경우 bean의 id값 생략 가능
		CharacterManager2 cm2 = context.getBean(CharacterManager2.class);
		
		System.out.println("======== XML 파일을 통한 객체 주입 ========");
		
		Warrior warrior1 = context.getBean("warrior", Warrior.class);
		Hunter hunter1 = context.getBean("hunter", Hunter.class);
		Wizard wizard1_1 = context.getBean("wizard1", Wizard.class);
		Wizard wizard1_2 = context.getBean("wizard2", Wizard.class);
		
		cm2.setWarrior(warrior1);
		cm2.princCharacter1Info();
		
		cm2.setHunter(hunter1);
		cm2.princCharacter2Info();

		cm2.setWizard(wizard1_1);
		cm2.princCharacter3Info();
		
		cm2.setWizard(wizard1_2);
		cm2.princCharacter3Info();
		
		System.out.println("=========================================");
		
		Warrior warrior2 = context.getBean(Warrior.class);
		Hunter hunter2 = context.getBean(Hunter.class);
//		Wizard wizard2 = context.getBean(Wizard.class);
		
		cm2.setWarrior(warrior2);
		cm2.princCharacter1Info();
		
		cm2.setHunter(hunter2);
		cm2.princCharacter2Info();
		
//		cm2.setWizard(wizard2);
//		cm2.princCharacter3Info();
		
		return "home";
		
	}

}
