package com.study.spring.case05.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP_XML {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopxml-config.xml");
		Calc calc = ctx.getBean("calcImpl", Calc.class);
		System.out.println(calc.add(1, 2));
	}
}