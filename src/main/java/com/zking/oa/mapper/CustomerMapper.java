package com.zking.oa.mapper;

import com.zking.oa.model.Customer;

import java.util.List;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    List<Customer> list(Customer customer);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    Customer loadCascade(Customer customer);

}