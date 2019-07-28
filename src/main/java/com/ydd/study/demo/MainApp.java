package com.ydd.study.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
 
	public static void main(String[] args) {
 
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		
		HelloWorld obj = context.getBean("helloWorld",HelloWorld.class);
		
		System.out.println(obj);
	}
 
}
