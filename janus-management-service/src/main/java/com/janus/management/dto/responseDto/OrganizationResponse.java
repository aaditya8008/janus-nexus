package com.janus.management.dto.responseDto;

import java.time.LocalDateTime;

import com.janus.management.entity.Organization;
import com.janus.management.entity.OrganizationStatus;

import lombok.Getter;

@Getter 
public class OrganizationResponse {
    
    private Long id;
    private String name;
    private String slug;
    private OrganizationStatus status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public OrganizationResponse(Long id, String name, String slug, OrganizationStatus status,
                                LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public static  OrganizationResponse from(Organization organization) {
        return  new OrganizationResponse(organization.getId(), organization.getName(), organization.getSlug(), organization.getStatus(), organization.getCreatedAt(), organization.getUpdatedAt());
    }
}
