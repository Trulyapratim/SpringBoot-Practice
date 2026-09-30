package com.apratim;

import com.amanprakashsharma.CartService;
import com.apratim.payment.CardPayment;
import com.apratim.payment.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // we have passed the reflection of configuration class
        // ApplicationContext is an IOC container in spring. It is an interface

        PaymentService paymentService =
                context.getBean("cardPayment", PaymentService.class);
        paymentService.pay();

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

//        CartService cs = new CartService();
//        cs.addToCart(); self made object

        User user = context.getBean(User.class);
        System.out.println(user.getName());

        // assigned to spring

        CartService cart = context.getBean(CartService.class);
        cart.addToCart();
    }
}
