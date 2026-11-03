package com.janus.management.event;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter 
@AllArgsConstructor 
public class GatewayConfigurationChangeEvent {
    
    private String eventId;
    private String eventType;
    private String changeType;
    private Long organizationId;
    private String routeId;
    private Long configurationVersion;
    private LocalDateTime occurredAt;
}
