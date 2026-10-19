package com.janus.management.dto.responseDto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
public class HealthResponse {
   private String serviceStatus;
    private String dbStatus;
    private LocalDateTime timestamp;
    public HealthResponse(String serviceStatus, String dbStatus, LocalDateTime timestamp) {
        this.serviceStatus = serviceStatus;
        this.dbStatus = dbStatus;
        this.timestamp = timestamp;
    }
}
