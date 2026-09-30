package com.apratim.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cardPayment")
public class CardPayment implements PaymentService{
    @Override
    public void pay(){
        System.out.println("Payed via card");
    }
}
