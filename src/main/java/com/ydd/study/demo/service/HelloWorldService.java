package com.ydd.study.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ydd.study.demo.dao.HelloWorldDao;

@Service
public class HelloWorldService {
	
	@Resource(name ="helloWorldDao")
	public HelloWorldDao helloWorldDao ;
	
	public void saveHello() {
		String name = "张三";
		String msg = helloWorldDao.save(name);
		System.out.println(" service : " + msg);
	}
	

}
