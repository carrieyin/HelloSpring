package com.ydd.study.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ydd.study.demo.entity.User;

public class Demo1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		User userBean = (User)context.getBean("user");
		System.out.println(userBean.getName());		
		context.close();
	}
}
