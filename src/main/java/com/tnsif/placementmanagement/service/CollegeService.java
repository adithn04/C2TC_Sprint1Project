package com.tnsif.placementmanagement.service;

import com.tnsif.placementmanagement.entity.College;
import com.tnsif.placementmanagement.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository repo;

    public List<College> getAll() {
        return repo.findAll();
    }

    public College getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public College save(College college) {
        return repo.save(college);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
