package com.amanprakashsharma;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        // through id  -> then it will return the object that needs to be typecasted.
//        // get bean by id/ name
//        OrderService orderService = (OrderService) context.getBean("orderService");
//        orderService.placeOrder();

        // get bean by type
        OrderService orderService = context.getBean("orderService", OrderService.class);

//        PaymentService paymentService = context.getBean("paymentService", PaymentService.class);
//        paymentService.pay();

        orderService.placeOrder();
    }
}
