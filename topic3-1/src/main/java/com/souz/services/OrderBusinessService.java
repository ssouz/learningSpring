package com.souz.services;

import com.souz.models.OrderModel;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Log4j2

public class OrderBusinessService implements OrdersBusinessServiceInterface{
    @Override
    public void test() {
        log.info("OrderBusinessService is working");
    }

    @Override
    public List<OrderModel> getOrder() {
        List<OrderModel> orders = new ArrayList<>();
        log.info("OrderBusinessService.getOrder is working");
        orders.add(new OrderModel(0L,"#1234","T-shirt",15.0f,5));
        orders.add(new OrderModel(1L,"#3456","Water bottles",1.5f,12));
        orders.add(new OrderModel(2L,"#7890","Phone case",12.99f,2));
        orders.add(new OrderModel(3L,"#6789","HDMI cables",8.50f,4));
        orders.add(new OrderModel(4L,"#0123","Protein powder",24.99f,1));
        orders.add(new OrderModel(5L,"#4567","Coffee beans",10.0f,2));
        return orders;
    }
}
