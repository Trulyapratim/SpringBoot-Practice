package com.apratim;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // to tell spring that it is a configuration class
@ComponentScan("com.apratim") // to find out the classes that have been marked Component
public class AppConfig {

}
