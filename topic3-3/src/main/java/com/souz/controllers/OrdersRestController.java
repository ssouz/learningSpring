package com.souz.controllers;

import com.souz.models.OrderModel;
import com.souz.services.OrdersBusinessServiceInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersRestController {
    //dependency injection
    final OrdersBusinessServiceInterface orderBusinessService;
    public OrdersRestController(OrdersBusinessServiceInterface service) {
        this.orderBusinessService = service;
    }

    @GetMapping("/")
    public List<OrderModel> showAllOrders(){
        //generate some orders
        //will send a hard-coded list of
        return orderBusinessService.getOrders();
    }
    @GetMapping("/search/{searchTerm}")
    public List<OrderModel> searchOrders(@PathVariable(name="searchTerm")String searchTerm){
        return orderBusinessService.searchOrders(searchTerm);
    }
    @GetMapping("/id/{id}")
    public OrderModel getById(@PathVariable(name="id")long id){
        return orderBusinessService.getById(id);
    }
    @PostMapping("/")
    public boolean addOne(@RequestBody OrderModel model){
        return orderBusinessService.addOne(model);
    }

    @GetMapping("/delete/{id}")
    public boolean deleteOne(@PathVariable(name="id")long id){
        return orderBusinessService.deleteOne(id);
         
    }
    @PutMapping("/update/{id}")
    public void addOne(@RequestBody OrderModel model,@PathVariable(name="id")long id){
        orderBusinessService.updateOne(id, model);
    }

}
