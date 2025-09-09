package com.tnsif.placementmanagement.controller;

import com.tnsif.placementmanagement.entity.Placement;
import com.tnsif.placementmanagement.service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/placements")
public class PlacementController {

    @Autowired
    private PlacementService service;

    @GetMapping
    public List<Placement> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Placement getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Placement create(@RequestBody Placement placement) {
        return service.save(placement);
    }

    @PutMapping("/{id}")
    public Placement update(@PathVariable Long id, @RequestBody Placement placement) {
        placement.setId(id);
        return service.save(placement);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
