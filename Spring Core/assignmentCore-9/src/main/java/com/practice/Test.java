package com.practice;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		LifeCycleDemo object= (LifeCycleDemo) context.getBean("HelloWorld");
		System.out.println(object.getMessage());
		context.registerShutdownHook();
	}
}
