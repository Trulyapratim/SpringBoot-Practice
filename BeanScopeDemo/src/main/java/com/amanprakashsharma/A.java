package com.amanprakashsharma;

import org.springframework.stereotype.Component;

@Component
public class A {
    private OrderService orderService;

    public A(OrderService orderService){
        this.orderService = orderService;
    }
}
