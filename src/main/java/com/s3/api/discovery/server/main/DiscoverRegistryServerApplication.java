package com.s3.api.discovery.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoverRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverRegistryServerApplication.class, args);
		System.out.println("Registry Server running....");
	}

}
