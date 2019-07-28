package com.ydd.study.demo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldDao {
	
	public HelloWorldDao() {
		System.out.println("HelloWorld init ...");
	}

	public String save(String name) {
		return "save <"+name+"> ...";
	}
}