package com.ydd.study.demo.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ydd.study.demo.service.HelloWorldService;

public class MainApp {
 
	public static void main(String[] args) {
 
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorldService service = context.getBean("helloWorldService",HelloWorldService.class);
		
		service.saveHello();
	}
 
}