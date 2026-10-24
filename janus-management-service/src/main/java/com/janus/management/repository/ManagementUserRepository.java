package com.janus.management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.janus.management.entity.ManagementUser;

public interface ManagementUserRepository extends JpaRepository<ManagementUser, Long> {
    Optional<ManagementUser> findByUsername(String username);
}
