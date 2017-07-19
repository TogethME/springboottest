package com.fnps.services.customerservice;

import com.fnps.entities.customer.CustomerEntity;

public interface ICustomerService {
	public CustomerEntity findByName(String name);

	public int testSave();
}
