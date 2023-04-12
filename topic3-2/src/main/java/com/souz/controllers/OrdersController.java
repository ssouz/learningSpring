package com.souz.controllers;

import com.souz.models.OrderModel;
import com.souz.services.OrdersBusinessServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    //dependency injection
    final OrdersBusinessServiceInterface orderBusinessService;
    @Autowired
    public OrdersController(OrdersBusinessServiceInterface service) {
        this.orderBusinessService = service;
    }

    @GetMapping("/")
    public String showAllOrders(Model model){
        //generate some orders
        //will send a hard-coded list of


        List<OrderModel> orders = orderBusinessService.getOrder()  ;
        model.addAttribute("tittle","some products");
        model.addAttribute("orders", orders);
        return "orders";
    }
}
