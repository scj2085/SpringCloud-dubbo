package com.java.dubbo;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

import com.java.dubbo.projectName.service.impl.CloudServiceImpl;
import com.java.dubbo.projectName.util.SpringUtil;

/**
 * cloud和dubbo公共服务(提供服务)
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudProjectNameApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringCloudProjectNameApplication.class, args);
		
		//测试用
		String[] beanNames =  ctx.getBeanDefinitionNames();  
        System.out.println("beanNames个数："+beanNames.length);  
        for(String bn:beanNames){  
            System.out.println(bn);  
        } 
        System.err.println(SpringUtil.getBean("cloudServiceImpl"));  
		
	}
}
