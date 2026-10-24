package com.janus.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.janus.management.entity.Organization;
import com.janus.management.entity.OrganizationStatus;

import java.util.List;
import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    boolean existsByNameIgnoreCase(String name);

    boolean existsBySlugIgnoreCase(String slug);

    List<Organization> findAllByStatusNot(OrganizationStatus status);

    Optional<Organization> findByIdAndStatusNot(Long id, OrganizationStatus status);
}
