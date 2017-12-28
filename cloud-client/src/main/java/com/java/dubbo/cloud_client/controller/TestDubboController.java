package com.java.dubbo.cloud_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.common.json.JSONObject;
import com.alibaba.dubbo.config.annotation.Reference;
import com.java.dubbo.cloud_client.service.TestCloudService;
import com.java.dubbo.service.AddService;
import com.java.dubbo.service.FindTestService;

@RestController
public class TestDubboController {

	@Autowired
    private FindTestService findTestService;
	@Autowired
	private TestCloudService testCloudSerice;
	
	/**
	 * 调用cloud和dubbo的公共服务(cloud-projectNameCommon)
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/testCloud/{name}", method = RequestMethod.GET)
	public String testCloud(@PathVariable("name") String name){
		return testCloudSerice.testCloud(name);
	}
	
    /** 
     * 调用dubbo服务(dubbo-server)
     * @param name 名字； 
     * @return 
     */  
    @RequestMapping("/test/{name}")  
    public String testJson(@PathVariable("name") String name) {  
        String testStr = findTestService.sayHello(name);  
        return testStr;  
    }
    

}
