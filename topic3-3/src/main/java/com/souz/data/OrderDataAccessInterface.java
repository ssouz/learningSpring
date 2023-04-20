package com.souz.data;

import com.souz.models.OrderModel;

import java.util.List;

public interface OrderDataAccessInterface {
    OrderModel getById(long id);
    List<OrderModel> getOrders();
    List<OrderModel> searchOrders(String searchTerm);
    boolean addOne(OrderModel newOrder);
    boolean deleteOne(long id);
    void updateOne(long idToUpdate, OrderModel updatedOrder);
}
