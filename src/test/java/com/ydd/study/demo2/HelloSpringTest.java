package com.ydd.study.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ydd.study.demo2.entity.Car;
import com.ydd.study.demo2.entity.User;

public class HelloSpringTest {
	
	@Test
	public void test(){
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("demo2.xml");
		User userBean = (User)context.getBean("user");
		System.out.println(userBean);
		
		Car carBean = (Car) context.getBean("car2");
		System.out.println(carBean);
	}

}
