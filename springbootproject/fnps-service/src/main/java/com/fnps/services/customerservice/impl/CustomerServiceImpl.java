package com.fnps.services.customerservice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fnps.dao.customer.CustomerRepository;
import com.fnps.entities.customer.CustomerEntity;
import com.fnps.services.customerservice.ICustomerService;

@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService{
	@Autowired
	CustomerRepository cmDao ;
	
	@Override
	public CustomerEntity findByName(String name) {
		// TODO Auto-generated method stub
		CustomerEntity cmEntity = cmDao.findByName(name);
		return cmEntity;
	}

}
