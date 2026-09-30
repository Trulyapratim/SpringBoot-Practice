package com.apratim;

import com.apratim.notification.EmailService;
import com.apratim.notification.NotificationService;
import com.apratim.notification.PopUpNotificationService;
import com.apratim.notification.SmsService;

public class Main {
    public static void main() {
        NotificationService notification = new PopUpNotificationService(); // notification object creation
//        OrderService order = new OrderService(notification);
        OrderService order = new OrderService(); // creates orderService
        order.setNotification(notification); // notification object is passed to OrderService through setter
    }
}

// A class should ask what it needs, and not
// build everything itself


// IOC ---> Inversion of control --> is idea or principle

// DI is approach / technique to achieve IOC


// Spring Framework --> IOC container --> Beans
// IOC container :
// 1. Create Object
// 2. Manage Objects
// 3. Connects object together


