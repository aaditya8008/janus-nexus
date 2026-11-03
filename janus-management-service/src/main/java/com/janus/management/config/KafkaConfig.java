package com.janus.management.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import org.springframework.beans.factory.annotation.Value;

@Configuration 
public class KafkaConfig {
    
    @Bean 
    public NewTopic gatewayConfigurationTopic(
        @Value ("${gateway.kafka.configuration.topic}") String topicName) {
        return TopicBuilder.name(topicName)
            .partitions(1)
            .replicas(1)
            .build();
    }
}
