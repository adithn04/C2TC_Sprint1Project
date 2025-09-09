package com.tnsif.placementmanagement.repository;

import com.tnsif.placementmanagement.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacementRepository extends JpaRepository<Placement, Long> {
}
