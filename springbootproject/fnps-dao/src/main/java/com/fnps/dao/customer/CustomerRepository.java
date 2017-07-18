package com.fnps.dao.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.fnps.entities.customer.CustomerEntity;

@Transactional
public interface CustomerRepository extends JpaRepository<CustomerEntity , Long>{

	CustomerEntity findByName(String name);
}
