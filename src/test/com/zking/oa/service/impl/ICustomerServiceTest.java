package com.zking.oa.service.impl;

import com.zking.oa.model.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.statements.SpringFailOnTimeout;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class ICustomerServiceTest extends BaseTest{

    @Autowired
    private ICustomerService customerService;

    private Customer customer;

    @Override
    public void before(){
        super.before();
        customer=new Customer();
    }

    @Test
    public void add() {
//        customer.setCustomerId();
        customer.setCustomerName("zsss");
        customerService.add(customer);
    }

    @Test
    public void del() {
        customer.setCustomerId(4);
        customerService.del(customer);
    }

    @Test
    public void edit() {
    }

    @Test
    public void load() {
        customer.setCustomerId(1);
        Customer load = customerService.load(customer);
        System.out.println(load);

    }

    @Test
    public void loadCascade() {
        customer.setCustomerId(1);
        Customer c = customerService.loadCascade(customer);
        System.out.println(c);

    }

    @Test
    public void list() {
        List<Customer> list = customerService.list(customer, null);
        for (Customer c:list){
            System.out.println(c);
        }
    }
}