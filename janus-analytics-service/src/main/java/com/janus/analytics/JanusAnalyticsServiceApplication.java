package com.janus.analytics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.mongodb.autoconfigure.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class JanusAnalyticsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JanusAnalyticsServiceApplication.class, args);
	}

}
