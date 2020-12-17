package com.currency.eurekha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekhaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekhaServiceApplication.class, args);
	}

}
