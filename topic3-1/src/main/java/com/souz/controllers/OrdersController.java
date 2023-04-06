package com.souz.controllers;

import com.souz.models.OrderModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @GetMapping("/")
    public String showAllOrders(Model model){
        //generate some orders
        //will send a hard-coded list of orders
        List<OrderModel> orders = new ArrayList<>();

        orders.add(new OrderModel(0L,"#1234","T-shirt",15.0f,5));
        orders.add(new OrderModel(1L,"#3456","Water bottles",1.5f,12));
        orders.add(new OrderModel(2L,"#7890","Phone case",12.99f,2));
        orders.add(new OrderModel(3L,"#6789","HDMI cables",8.50f,4));
        orders.add(new OrderModel(4L,"#0123","Protein powder",24.99f,1));
        orders.add(new OrderModel(5L,"#4567","Coffee beans",10.0f,2));

        model.addAttribute("tittle","some products");
        model.addAttribute("orders", orders);

        return "orders";
    }
}
