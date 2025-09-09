package com.tnsif.placementmanagement.controller;

import com.tnsif.placementmanagement.entity.College;
import com.tnsif.placementmanagement.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/colleges")
public class CollegeController {

    @Autowired
    private CollegeService service;

    @GetMapping
    public List<College> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public College getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public College create(@RequestBody College college) {
        return service.save(college);
    }

    @PutMapping("/{id}")
    public College update(@PathVariable Long id, @RequestBody College college) {
        college.setId(id);
        return service.save(college);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
