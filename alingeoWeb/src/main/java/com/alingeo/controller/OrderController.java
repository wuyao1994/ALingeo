package com.alingeo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.alingeo.domin.Order;
import com.alingeo.service.OrderService;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService mOrderService;
    @PostMapping("/getOrder")
    public Object getOrder(@RequestParam("id") String id) {
        Order order = mOrderService.findByOrderNumber(id);
        return order;
    }

}
