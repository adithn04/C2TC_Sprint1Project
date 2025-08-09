package com.tnsif.placementmanagement.controller;

import com.tnsif.placementmanagement.entity.Placement;
import com.tnsif.placementmanagement.service.PlacementService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/placements")
public class PlacementController {

    private final PlacementService placementService;

    public PlacementController(PlacementService placementService) {
        this.placementService = placementService;
    }

    @GetMapping
    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }

    @GetMapping("/{id}")
    public Placement getPlacementById(@PathVariable Long id) {
        return placementService.getPlacementById(id)
                .orElseThrow(() -> new RuntimeException("Placement not found"));
    }

    @PostMapping
    public Placement createPlacement(@RequestBody Placement placement) {
        return placementService.createPlacement(placement);
    }

    @PutMapping("/{id}")
    public Placement updatePlacement(@PathVariable Long id, @RequestBody Placement placement) {
        return placementService.updatePlacement(id, placement);
    }

    @DeleteMapping("/{id}")
    public void deletePlacement(@PathVariable Long id) {
        placementService.deletePlacement(id);
    }
}

