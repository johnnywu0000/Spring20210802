package com.study.spring.case05.aop_dancer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//使用 Java 配置檔代替 aop-config.xml
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AOPConfig {
	@Bean
	public Audience audience() {
		return new Audience();
	}

	@Bean(name = "dancer")
	public Performance dancer() {
		return new Dancer();
	}
}