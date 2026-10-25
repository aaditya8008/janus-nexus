package com.janus.management.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.janus.management.entity.ControlPlaneAuditRecord;

import java.util.List;

public interface ControlPlaneAuditRecordRepository extends JpaRepository<ControlPlaneAuditRecord, Long> {

    List<ControlPlaneAuditRecord> findAllByOrganizationIdOrderByCreatedAtDesc(Long organizationId);
}