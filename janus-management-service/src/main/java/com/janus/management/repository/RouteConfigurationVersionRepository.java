package com.janus.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.janus.management.entity.RouteConfigurationVersion;

import java.util.List;

public interface RouteConfigurationVersionRepository extends JpaRepository<RouteConfigurationVersion, Long> {

    List<RouteConfigurationVersion> findAllByOrganizationIdAndRouteIdOrderByVersionNumberDesc(Long organizationId,
                                                                                              String routeId);

}