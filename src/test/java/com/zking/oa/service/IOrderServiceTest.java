package com.zking.oa.service;

import com.zking.oa.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class IOrderServiceTest extends BaseTestCase {

    @Autowired
    private IOrderService orderService;

    private Order order;


    @Override
    public void before() {
        super.before();
        order = new Order();
    }

    @Test
    public void loadCasecode() throws Exception {
        order.setOrderId(1);

        Order order = orderService.loadCasecode(this.order);
        System.out.println(order);
        System.out.println(order.getCustomer());
    }

}