package com.janus.management.dto.responseDto;

import com.janus.management.entity.ManagementUser;

import lombok.Getter;

@Getter
public class TenantAdminResponse {

    private Long id;
    private Long organizationId;
    private String username;
    private boolean enabled;

    public TenantAdminResponse(Long id, Long organizationId, String username, boolean enabled) {
        this.id = id;
        this.organizationId = organizationId;
        this.username = username;
        this.enabled = enabled;
    }

    public static TenantAdminResponse from(ManagementUser user) {
        return new TenantAdminResponse(user.getId(), user.getOrganization().getId(), user.getUsername(),
                user.isEnabled());
    }
}