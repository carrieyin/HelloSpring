package com.ydd.study.demo;

public class HelloWorld {
	
	public HelloWorld() {
		System.out.println("HelloWorld init ...");
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		return getClass().getName() + ": " + "message:" + message;
	}

}