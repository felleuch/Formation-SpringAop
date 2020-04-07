package com.wha.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.wha.services.SimpleService;

public class AppMain {
		
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");			
		SimpleService service = (SimpleService) context.getBean("simpleServiceProxy");		
		//service.printNameId();			
		
		service.setName("test");
		try {			
			service.checkName();			
		}catch(IllegalArgumentException e) {
			
		}
		
		
		//service.sayHello("Tout le monde");
		
		//service.checkName();
		
		
	}

}
