package com.java.dubbo.cloud_client.service.impl;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.java.dubbo.cloud_client.service.TestCloudService;
import com.java.dubbo.service.AddService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class TestCloudServiceImpl implements TestCloudService{

	@Autowired
    RestTemplate restTemplate;
	@Autowired 
	private AddService addService;
	
	@HystrixCommand(fallbackMethod = "testCloudFallback",commandKey = "comkey")
	@Override
	public String testCloud(String name) {
		long start = System.currentTimeMillis();
		ResponseEntity<String> resposEntity = restTemplate.getForEntity("http://cloud-projectNameCommon/addTest/{1}", String.class,name);//String第二个参数是返回类型，name是占位符{1}的参数
    	String body = resposEntity.getBody();
    	long end = System.currentTimeMillis();
    	//设置日期输出的格式  
    	SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
    	System.err.println("********************" + body + "Spend:" + df.format(end-start));
    	
        return body;
	}

	@HystrixCommand(fallbackMethod = "testCloudFallback2")
    public String testCloudFallback(String name) {
    	
        return "第一层服务降级";
    }
    public String testCloudFallback2(String name) {
    	
    	return "第二层服务降级";
    }
	
    
}
