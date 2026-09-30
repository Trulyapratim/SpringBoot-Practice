package com.apratim;

import com.amanprakashsharma.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // to tell spring that it is a configuration class
@ComponentScan("com.apratim") // to find out the classes that have been marked Component
public class AppConfig {
    @Bean
    public User createUser(){
        return new User("Aman", 21);
    }

    @Bean
    public CartService createCartService(){
        return new CartService();
    }
}
