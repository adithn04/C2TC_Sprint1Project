package com.tnsif.placementmanagement.repository;

import com.tnsif.placementmanagement.entity.Certificate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}
