package com.tnsif.placementmanagement.service;

import com.tnsif.placementmanagement.entity.Placement;
import com.tnsif.placementmanagement.repository.PlacementRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PlacementService {

    private final PlacementRepository placementRepository;

    public PlacementService(PlacementRepository placementRepository) {
        this.placementRepository = placementRepository;
    }

    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    public Optional<Placement> getPlacementById(Long id) {
        return placementRepository.findById(id);
    }

    public Placement createPlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    public Placement updatePlacement(Long id, Placement updatedPlacement) {
        return placementRepository.findById(id)
                .map(placement -> {
                    placement.setCompanyName(updatedPlacement.getCompanyName());
                    placement.setJobRole(updatedPlacement.getJobRole());
                    placement.setDriveDate(updatedPlacement.getDriveDate());
                    placement.setCollege(updatedPlacement.getCollege());
                    return placementRepository.save(placement);
                }).orElseThrow(() -> new RuntimeException("Placement not found"));
    }

    public void deletePlacement(Long id) {
        placementRepository.deleteById(id);
    }
}
