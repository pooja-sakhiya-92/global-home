package com.home.globalhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GlobalHomeApplication {

	public static void main(String[] args) {

		System.setProperty("spring.config.name", "home-server");
		SpringApplication.run(GlobalHomeApplication.class, args);
	}

}
