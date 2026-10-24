package com.janus.management.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janus.management.dto.requestDto.LoginRequest;
import com.janus.management.dto.responseDto.LoginResponse;
import com.janus.management.service.AuthenticationService;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;


@RestController 
@RequestMapping ("/api/auth")
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request){
        return ResponseEntity.ok(authenticationService.login(request));
    }
}
