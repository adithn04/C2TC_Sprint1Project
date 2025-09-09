package com.tnsif.placementmanagement.service;

import com.tnsif.placementmanagement.entity.Placement;
import com.tnsif.placementmanagement.repository.PlacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository repo;

    public List<Placement> getAll() {
        return repo.findAll();
    }

    public Placement getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Placement save(Placement placement) {
        return repo.save(placement);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
