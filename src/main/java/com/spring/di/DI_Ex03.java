package com.spring.di;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DI_Ex03 {
	
	@Autowired
	DiSampleClass1 diSampleClass1_1;
	
	@Inject
	DiSampleClass1 diSampleClass1_2;
	
	@Autowired
	DiSampleClass2 diSampleClass2_1;
	
	@Autowired
	DiSampleClass2 diSampleClass2_2;
	
	@RequestMapping(value="/diEx03", method = RequestMethod.GET)
	public String mainString() {
		
		System.out.println("====== 컴포넌트 스캔을 이용한 객체 주입 ======");
		
		//기본 데이터 타입 모델 주입 예시
		diSampleClass1_1.printInfo();
		diSampleClass1_2.printInfo();
		System.out.println();
		
		//생성자 주입 예시
		diSampleClass2_1.print();
		diSampleClass2_2.print();
		
		return "home";
		
	}

}
