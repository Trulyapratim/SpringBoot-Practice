package com.apratim;

import com.apratim.notification.EmailService;
import com.apratim.notification.NotificationService;
import com.apratim.notification.PopUpNotificationService;
import com.apratim.notification.SmsService;

public class OrderService {

    NotificationService notification;

    public OrderService(NotificationService notification){   // constructor
        this.notification = notification;
    }
    public OrderService(){

    }

    public void placeOrder(){
        System.out.println("Order Placed");
        notification.sendNotification();
    }

    public void setNotification(NotificationService notification) { // setter
        this.notification = notification;
    }
}
