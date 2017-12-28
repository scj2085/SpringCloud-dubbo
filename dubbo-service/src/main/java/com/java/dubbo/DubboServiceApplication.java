package com.java.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * dubbo框架服务提供方
 * Hello world!
 *
 */
@SpringBootApplication
public class DubboServiceApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DubboServiceApplication.class, args);
	}
}
