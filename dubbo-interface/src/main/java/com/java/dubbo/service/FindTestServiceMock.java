package com.java.dubbo.service;

/**
 * 查询-服务降级
 * @author shichangjian
 *
 */
public class FindTestServiceMock implements FindTestService{

	@Override
	public String sayHello(String name) {
		return null;
	}

}
