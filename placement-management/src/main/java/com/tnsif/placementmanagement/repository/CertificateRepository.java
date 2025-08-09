package com.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.placementmanagement.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}

