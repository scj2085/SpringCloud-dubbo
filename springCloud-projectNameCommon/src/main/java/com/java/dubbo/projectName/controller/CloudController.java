package com.java.dubbo.projectName.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.dubbo.service.AddService;

@RestController
public class CloudController {

	@Autowired
	private AddService addService; 
	
	@RequestMapping(value = "/addTest/{name}", method = RequestMethod.GET)
	public String addTest(@PathVariable("name") String name){
		String sult = "";
		try {
//			Thread.sleep(6000);
			sult = addService.addTest(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sult;
	}


}
