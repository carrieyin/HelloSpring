package com.ydd.study.demo;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

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
