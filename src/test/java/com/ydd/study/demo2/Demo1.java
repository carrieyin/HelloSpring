package com.ydd.study.demo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ydd.study.demo2.entity.User;


public class Demo1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("demo2.xml");
		User userBean = (User)context.getBean("user");
		System.out.println(userBean.getName());		
		context.close();
	}
}
