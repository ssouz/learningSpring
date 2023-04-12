package com.souz.services;

import com.souz.models.OrderModel;

import java.util.List;

public interface OrdersBusinessServiceInterface {
    public void test();
    public List<OrderModel> getOrder();
    public void init();
    
    public void destroy();
}
