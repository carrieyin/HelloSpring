package com.ydd.study.demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ydd.study.demo.entity.Car;
import com.ydd.study.demo.entity.User;

public class HelloSpringTest {
	
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
