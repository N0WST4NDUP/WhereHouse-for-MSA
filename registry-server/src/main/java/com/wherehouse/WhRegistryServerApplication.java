package com.wherehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class WhRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhRegistryServerApplication.class, args);
	}

}
