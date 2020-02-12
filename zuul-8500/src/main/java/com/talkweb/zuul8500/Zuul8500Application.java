package com.talkweb.zuul8500;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Zuul8500Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul8500Application.class, args);
    }

}
