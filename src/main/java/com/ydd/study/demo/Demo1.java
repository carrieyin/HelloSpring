package com.ydd.study.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo1 {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		User userBean = (User)context.getBean("user");
		System.out.println(userBean.getName());
	}

}
