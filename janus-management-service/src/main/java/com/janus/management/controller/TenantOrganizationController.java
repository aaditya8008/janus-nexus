package com.janus.management.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janus.management.dto.requestDto.TenantOrganizationRequest;
import com.janus.management.dto.responseDto.OrganizationResponse;
import com.janus.management.service.OrganizationService;


import jakarta.validation.Valid;

@RestController 
@RequestMapping ("/api/tenant/organization")
public class TenantOrganizationController {
    
    private final OrganizationService organizationService;

    public TenantOrganizationController(OrganizationService organizationService){
        this.organizationService=organizationService;
    }

    @GetMapping 
    public ResponseEntity<OrganizationResponse> getOwnOrganization(){
        return ResponseEntity.ok(organizationService.getOwnOrganization());
    }

    @PutMapping 
    public ResponseEntity<OrganizationResponse> updateOwnOrganization(
        @Valid  @RequestBody TenantOrganizationRequest request
    ){
        return ResponseEntity.ok(organizationService.updateOwnOrganization(request));
    }

  
}
