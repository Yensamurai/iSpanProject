package com.web.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan
public class BigProjectSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigProjectSbApplication.class, args);
	}

}
