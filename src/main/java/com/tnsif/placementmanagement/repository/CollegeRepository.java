package com.tnsif.placementmanagement.repository;

import com.tnsif.placementmanagement.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Long> {
}
