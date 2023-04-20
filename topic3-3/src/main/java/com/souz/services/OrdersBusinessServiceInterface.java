package com.souz.services;

import com.souz.models.OrderModel;

import java.util.List;

public interface OrdersBusinessServiceInterface {
     void test();
     void init();
     void destroy();
     OrderModel getById(long id);
     List<OrderModel> getOrders();
     List<OrderModel> searchOrders(String searchTerm);
     boolean addOne(OrderModel newOrder);
     boolean deleteOne(long id);
     void updateOne(long idToUpdate, OrderModel updatedOrder);


}
