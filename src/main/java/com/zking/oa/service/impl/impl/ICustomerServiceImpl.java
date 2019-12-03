package com.zking.oa.service.impl.impl;

import com.zking.oa.mapper.CustomerMapper;
import com.zking.oa.model.Customer;
import com.zking.oa.service.impl.ICustomerService;
import com.zking.oa.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ICustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public CustomerMapper getCustomerMapper() {
        return customerMapper;
    }

    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }

    @Override
    public int add(Customer customer) {
        return this.customerMapper.insert(customer);
    }

    @Override
    public int del(Customer customer) {
        return this.customerMapper.deleteByPrimaryKey(customer.getCustomerId());
    }

    @Override
    public int edit(Customer customer) {
        return this.customerMapper.updateByPrimaryKey(customer);
    }

    @Override
    public Customer load(Customer customer) {
        return this.customerMapper.selectByPrimaryKey(customer.getCustomerId());
    }

    @Override
    public Customer loadCascade(Customer customer) {
        return this.customerMapper.loadCascade(customer);
    }

    @Override
    public List<Customer> list(Customer customer, PageBean pageBean) {
        return this.customerMapper.list(customer);
    }

}
