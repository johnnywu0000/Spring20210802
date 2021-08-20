package com.study.spring.case05.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class HelloTest {

	public static void main(String[] args) {
//		使用子類別(加強)來代理
		Hello hello = new EnhancerHello();
		System.out.println(hello.sayHello("Vincent"));
		System.out.println();

//		使用 cglib
		Enhancer enhancer = new Enhancer();	//增強
		enhancer.setSuperclass(Hello.class);	//目標
		enhancer.setCallback(new MyMethodInterceptor());	//攔截

		Hello hello2 = (Hello) enhancer.create();
		System.out.println(hello2.sayHello("Johnny Wu"));
	}

}