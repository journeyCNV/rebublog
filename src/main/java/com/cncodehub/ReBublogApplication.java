package com.cncodehub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ReBublogApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(ReBublogApplication.class, args);
    }

}
