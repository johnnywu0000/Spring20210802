package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest5 {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Paper p1 = (Paper) ctx.getBean("paper");
		System.out.println(p1);

		Paper2 p2 = (Paper2) ctx.getBean("paper2");
		System.out.println(p2);

		Paper3 p3 = (Paper3) ctx.getBean("paper3");
		System.out.println(p3);

		Paper p4 = (Paper) ctx.getBean("paper4");
		System.out.println(p4);
	}

}