package com.talkweb.eureka9000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka9000Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka9000Application.class, args);
	}

}
