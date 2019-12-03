package com.zking.oa.service.impl;

import com.zking.oa.model.Customer;
import com.zking.oa.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ICustomerService {
    int add(Customer customer);

    int del(Customer customer);

    int edit(Customer customer);

    @Transactional(readOnly = true)
    Customer load(Customer customer);

    @Transactional(readOnly = true)
    Customer loadCascade(Customer customer);

    @Transactional(readOnly = true)
    List<Customer> list(Customer customer, PageBean pageBean);

}
