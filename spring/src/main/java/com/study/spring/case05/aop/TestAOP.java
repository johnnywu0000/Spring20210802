package com.study.spring.case05.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
		Calc calc = ctx.getBean("calcImpl", Calc.class);
		System.out.println(calc.add(2, 1));
		System.out.println(calc.div(10, 0));
	}
}
