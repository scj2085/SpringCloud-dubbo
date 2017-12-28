package com.java.dubbo.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.dubbo.service.AddService;
import com.java.dubbo.service.FindTestService;

@RestController
public class TestController {
	
	@Autowired  
	private AddService addService;
    
    @RequestMapping("/testCloud/{name}")  
    public String testCloud(@PathVariable("name") String name) {  
    	String sult = "";
    	try {
			sult = addService.addTest(name);
		} catch (Exception e) {
			e.printStackTrace();
		}  
    	return sult;
    }
    
}
