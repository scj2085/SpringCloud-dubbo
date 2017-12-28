package com.java.dubbo.projectName.service.impl;

import org.springframework.stereotype.Component;

import com.java.dubbo.service.AddService;

@Component
public class CloudServiceImpl implements AddService{


	@Override
	public String addTest(String name) {
		return "Hello " + name;
	}



}
