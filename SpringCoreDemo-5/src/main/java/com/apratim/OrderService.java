package com.apratim;

import com.apratim.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // To tell spring to manage the objects of OrderService class
public class OrderService {
//    @Autowired
    private PaymentService paymentService; // field dependency injection

    @Autowired
    public OrderService(@Qualifier("cardPayment") PaymentService paymentService){  // constructor dependency injection
        this.paymentService = paymentService;
    }

//    @Autowired
//    public void setPaymentService(PaymentService paymentService) { // setter dependency injection
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        //paymentService.pay();
        System.out.println("Order Placed");
    }
}


// 2 ways to handle object through spring
// 1. Annotation based         2. Xml configuration based

// Reflection

// Why constructor injection is recommended: