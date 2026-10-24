package com.janus.management.dto.responseDto;

import lombok.Getter;

@Getter
public class LoginResponse {
    
    private String token;
    private String tokenType;
    private long expiresInSeconds;
    private String role;
    private Long organizationId;

    public LoginResponse(String token, String tokenType, long expiresInSeconds, String role, Long organizationId) {
        this.token = token;
        this.tokenType = tokenType;
        this.expiresInSeconds = expiresInSeconds;
        this.role = role;
        this.organizationId = organizationId;
    }
}
