package com.study.spring.case05.proxy.cglib;

//Enhancer 增強之 Hello
public class EnhancerHello extends Hello {
	@Override	//Interceptor 攔截
	public String sayHello(String str) {
		return super.sayHello(str) + " 請實行實聯制";
	}
}