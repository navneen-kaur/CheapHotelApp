package com.group.cheaphotel.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class CheapHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheapHotelApplication.class, args);
	}
}
