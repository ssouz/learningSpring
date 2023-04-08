package com.souz.services;

import com.souz.models.OrderModel;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Log4j2
@Primary

public class OrderBusinessService2 implements OrdersBusinessServiceInterface{
    @Override
    public void test() {
        log.info("OrderBusinessService is working");
    }

    @Override
    public List<OrderModel> getOrder() {
        List<OrderModel> orders = new ArrayList<>();
        log.info("OrderBusinessService.getOrder is working");
        orders.add(new OrderModel(0L,"#1234","Cheese pizza",12.99f,5));
        orders.add(new OrderModel(1L,"#5678","Grilled chicken sandwich",7.99f,12));
        orders.add(new OrderModel(2L,"#9012","Caesar salad",9.50f,2));
        orders.add(new OrderModel(3L,"#3456","Chocolate chip cookies",0.75f,4));
        orders.add(new OrderModel(4L,"#7890","Spaghetti and meatballs",14.99f,1));
        orders.add(new OrderModel(5L,"#2345","Chicken quesadilla ",10.99f,2));
        return orders;
    }
}
