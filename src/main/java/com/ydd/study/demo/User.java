package com.ydd.study.demo;

import org.apache.log4j.Logger;

import lombok.Data;

@Data
public class User {
	
	private String name;
	private int age;
	/*public User(){
		System.out.println("无参构造被调用");
	}*/
}
