package com.zking.oa.service.impl.impl;

import com.zking.oa.mapper.OrderMapper;
import com.zking.oa.model.Order;
import com.zking.oa.service.impl.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IOrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order loadCascade(Order order) {
        return orderMapper.loadCascade(order);
    }

}
