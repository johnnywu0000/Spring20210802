package com.study.spring.case05.proxy.dyn;

import com.study.spring.case05.proxy.sta.Man;
import com.study.spring.case05.proxy.sta.Person;

public class TestPerson {

	public static void main(String[] args) {
//		實現 Man 與 Woman 的工作
		Person man = (Person) new ProxyUtil(new Man()).getProxy();
		man.work();
	}

}