package com.zking.oa.service.impl;

import com.zking.oa.model.Order;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IOrderService {

    @Transactional(readOnly = true)
    Order loadCascade(Order order);


}
