package com.java.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 本服务是springCloud框架，作为cloud的消费方，
 * 调用dubbo项目和cloud-projectNameCommon(cloud-projectNameCommon项目作为cloud和dubbo的公用服务提供方)项目
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker//@EnableCircuitBreaker注解开启断路器功能，在feign中无需添加 ，自带的
public class CloudClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudClientApplication.class, args);
	}
}
