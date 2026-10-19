package com.janus.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication
public class JanusManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JanusManagementServiceApplication.class, args);
	}

}
