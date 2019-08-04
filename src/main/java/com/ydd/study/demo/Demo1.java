package com.ydd.study.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo1 {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		User userBean = (User)context.getBean("user");
		System.out.println(userBean.getName());		
		
	}
	
	@Test
	public void test(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("beans.xml");
		User userBean = (User)context.getBean("user");
		System.out.println(userBean);
		
		Car carBean = (Car) context.getBean("car2");
		System.out.println(carBean);
	}

}
