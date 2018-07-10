package com.levo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class LevoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LevoApplication.class, args);
    }
}
