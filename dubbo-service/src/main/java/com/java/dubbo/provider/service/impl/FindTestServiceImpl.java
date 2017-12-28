package com.java.dubbo.provider.service.impl;

import com.java.dubbo.service.AddService;
import com.java.dubbo.service.FindTestService;

public class FindTestServiceImpl implements FindTestService,AddService{
	static int sayHelloCount = 0;
	
	public String sayHello(String name) {
		return "Hello " + name + "查询成功!"; 
	}

	@Override
	public String addTest(String name) throws Exception{
		if(1 > 0){
			throw new RuntimeException("RuntimeException");
		}
		return "Hello " + name + "添加成功!";
	}
	 
}
