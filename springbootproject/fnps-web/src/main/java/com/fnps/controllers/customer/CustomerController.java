package com.fnps.controllers.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fnps.entities.customer.CustomerEntity;
import com.fnps.services.customerservice.ICustomerService;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
	
	@Autowired
	ICustomerService cmService;
	
	@RequestMapping("get-By-Name")
	@ResponseBody
	public CustomerEntity getByName(String name){
		CustomerEntity cmEntity = cmService.findByName(name);
		return cmEntity;
	}
}
