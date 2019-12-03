package com.zking.oa.service.impl;

import com.zking.oa.model.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})

public class IOrderServiceTest extends BaseTest{
    @Autowired
    private IOrderService orderService;

    private Order order;

    @Override
    public void before() {
        super.before();
        this.order=new Order();
    }


    @Test
    public void loadCascade() {
        order.setOrderId(1);
        Order order = orderService.loadCascade(this.order);
        System.out.println(order);
        System.out.println(order.getCustomer());
    }

}