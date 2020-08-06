package com.udacity.L4_dog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class L4DogApplication {

	public static void main(String[] args) {
		SpringApplication.run(L4DogApplication.class, args);
	}

}
