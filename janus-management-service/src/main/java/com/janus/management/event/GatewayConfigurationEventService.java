package com.janus.management.event;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service 
public class GatewayConfigurationEventService {
    
    private final ApplicationEventPublisher eventPublisher;

    public GatewayConfigurationEventService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void publish(String changeType, Long organizationId, String routeId,
        Long configurationVersion
    ){
        eventPublisher.publishEvent(new GatewayConfigurationChangeEvent(
            UUID.randomUUID().toString(),
            "GATEWAY_CONFIGURATION_CHANGE",
            changeType,
            organizationId,
            routeId,
            configurationVersion,
            LocalDateTime.now()
        ));
    }
}
