package com.ydd.study.demo.entity;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User {
	@Value(value="TOM")
	private String name;
	@Value("18")
	private int age;
	//@Autowired
	@Resource(name="car2")
	private Car car;
	/*public User(){
		System.out.println("无参构造被调用");
	}*/
}
