package com.talkweb.provider8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider8000Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider8000Application.class, args);
    }
}
