package com.janus.analytics.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janus.analytics.dto.responseDto.HealthResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping ("/health")
public class HealthController {
    private String servicename;
    private String serviceDescription;

    public HealthController(@Value("${info.app.name}") String servicename, @Value("${info.app.description}") String serviceDescription) {
        this.servicename = servicename;
        this.serviceDescription = serviceDescription;
    }

    @GetMapping
    public ResponseEntity<HealthResponse> health() {
        HealthResponse response = new HealthResponse(servicename, serviceDescription, "UP");
        return ResponseEntity.ok(response);
    }
}
