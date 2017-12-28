package com.java.dubbo.cloud_client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

@Configuration  
@ImportResource({ "classpath:dubbo/*.xml" })
public class DubboConfig {

	@Bean
	@LoadBalanced//@LoadBalanced用来给RestTemplate做标记，以使用负载均衡的客户端LoadBalancedClient来配置它，注解开启均衡负载能力，负载均衡的规则：使用线性遍历ping服务实例的方式进行检查
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
