package com.study.spring.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
public class Husband {
    private String name;
    private Wife wife;
    //...
}

public class Wife {
    private String name;
    private Husband husband;
    //...
}
用 Spring 配置
John 的老婆是 Mary
Mary 的丈夫是 John
*/

public class MainTest2 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Husband husband = (Husband) ctx.getBean("husband");
		Wife wife = (Wife) ctx.getBean("wife");
		System.out.println(husband);
		System.out.println(wife);
		System.out.printf("%s 的老婆是 %s\n", husband.getName(), husband.getWife().getName());
		System.out.printf("%s 的丈夫是 %s\n", wife.getName(), wife.getHusband().getName());

		Husband husband2 = (Husband) ctx.getBean("husband2");
		Wife wife2 = (Wife) ctx.getBean("wife2");
		System.out.println(husband2 + ", " + husband2.getWife());
		// wife2.setHusband(husband2);
		System.out.println(wife2 + ", " + wife2.getHusband());

	}

}
