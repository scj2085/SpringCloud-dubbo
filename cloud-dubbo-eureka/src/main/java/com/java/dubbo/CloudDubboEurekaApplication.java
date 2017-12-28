package com.java.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * cloud注册中心
 * Hello world!
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class CloudDubboEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudDubboEurekaApplication.class, args);
	}
}
