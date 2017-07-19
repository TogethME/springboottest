package com.fnps.mapper.customer;

import com.fnps.entities.customer.CustomerEntity;
import com.fnps.mybaties.config.BusinessMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by 淮哲琪 on 2017/7/19.
 */
@Mapper
public interface CustomerMapper extends BusinessMapper{
    CustomerEntity getById(int id);

    CustomerEntity getByName(String name);
}
