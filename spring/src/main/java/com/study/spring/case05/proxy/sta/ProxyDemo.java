package com.study.spring.case05.proxy.sta;

public class ProxyDemo {
	public static void main(String[] args) {
/*//		不透過代理直接執行
 		Person p1 = new Man(); Person p2 = new Woman();
 		p1.work();
		p2.work();	*/
		Person p1 = new PersonProxy(new Man());
		Person p2 = new PersonProxy(new Woman());
		p1.work();
		p2.work();
	}
}
