package com.janus.management.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janus.management.dto.responseDto.HealthResponse;
import com.janus.management.service.HealthService;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/health")
public class HealthController {

    public final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping
    public ResponseEntity<HealthResponse> health() {
        String dbStatus = healthService.getHealth();
        return ResponseEntity.ok(
                new HealthResponse("UP", dbStatus, LocalDateTime.now()));
    }
}
