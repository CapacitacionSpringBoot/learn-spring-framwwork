package com.fam.springboot.learnspringframwwork.enterprise.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fam.springboot.learnspringframwwork.enterprise.example.businessservices.BusinessService;

@Component
public class MyWebController {
	@Autowired
	private BusinessService businessService;
	
	public long returnValueFromBusinessService() {
		return businessService.calculateSum();
	}
}


