package com.fnps.services.customerservice.impl;

import com.fnps.mapper.customer.CustomerMapper;
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
	CustomerMapper customerMapper;
	@Override
	public CustomerEntity findByName(String name) {
		// TODO Auto-generated method stub
		CustomerEntity cmEntity = customerMapper.getByName(name);
		return cmEntity;
	}
	@Override
	public int testSave(){
		CustomerEntity entity = new CustomerEntity();
		entity.setName("测试");
		entity.setId(007);
		entity.setTelephone("18036096603");
		entity.setContact("测试测试");
		return customerMapper.insert(entity);
	}

}
