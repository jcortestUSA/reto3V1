package com.mintic.retoBike.bike3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.mintic.retobike.bike3.model"})
@SpringBootApplication
public class Bike3Application {

	public static void main(String[] args) {
		SpringApplication.run(Bike3Application.class, args);
	}

}