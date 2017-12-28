package com.java.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * dubbo服务消费方
 *
 */
@SpringBootApplication
public class DubboClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(DubboClientApplication.class, args);
    }
}
