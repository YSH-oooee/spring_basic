package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DI_Ex02 {
	
	@RequestMapping(value="/diEx02", method = RequestMethod.GET)
	public String mainString() {
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:characterApplicationContext.xml");
		
		Warrior warrior1 = context.getBean("warrior", Warrior.class);
		
		
		
		return "Home";
		
	}

}
