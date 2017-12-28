package com.java.dubbo.service;

/**
 * 增，删，该-服务降级
 * @author shichangjian
 *
 */
public class AddServiceMock implements AddService{

	@Override
	public String addTest(String name) throws Exception{
		throw new RuntimeException(name + "user fail!");
	}

}
