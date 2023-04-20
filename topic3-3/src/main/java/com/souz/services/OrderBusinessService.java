package com.souz.services;

import com.souz.data.OrderDataAccessInterface;
import com.souz.models.OrderModel;
import lombok.extern.log4j.Log4j2;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


@Log4j2
public class OrderBusinessService implements OrdersBusinessServiceInterface{

    @Autowired
    OrderDataAccessInterface ordersDAO;


    @Override
    public void test() {
        log.info("OrderBusinessService is working");
    }

    @Override
    public void init() {
        log.info("Init method of the OrderBusinessService");
    }

    @Override
    public void destroy() {
        log.info("Destroy method of the OrderBusinessService");

    }
    @Override
    public List<OrderModel> getOrders() {
        log.info("OrderBusinessService.getOrder is working");
        
        return ordersDAO.getOrders();
    }

    @Override
    public OrderModel getById(long id) {
       return ordersDAO.getById(id);
    }

    @Override
    public List<OrderModel> searchOrders(String searchTerm) {
        return ordersDAO.searchOrders(searchTerm);
    }

    @Override
    public boolean addOne(OrderModel newOrder) {
        return ordersDAO.addOne(newOrder);
    }

    @Override
    public boolean deleteOne(long id) {
        return ordersDAO.deleteOne(id);
    }

    @Override
    public void updateOne(long idToUpdate, OrderModel updatedOrder) {
        ordersDAO.updateOne(idToUpdate, updatedOrder);
    }
}
