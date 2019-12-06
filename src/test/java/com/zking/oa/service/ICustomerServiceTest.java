package com.zking.oa.service;

import com.zking.oa.model.Customer;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ICustomerServiceTest extends BaseTestCase {

    @Autowired
    private ICustomerService customerService;

    private Customer customer;

    @Override
   public void before(){
       super.before();
       customer=new Customer();
   }
    @Test
    public void loadCasecode() throws Exception {
       customer.setCustomerId(1);
        Customer customer = customerService.loadCasecode(this.customer);
        System.out.println(customer);
        System.out.println(customer.getOrderList());
    }

}