package com.tnsif.placementmanagement.service;

import com.tnsif.placementmanagement.entity.Admin;
import com.tnsif.placementmanagement.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminRepository repo;

    public List<Admin> getAll() {
        return repo.findAll();
    }

    public Admin getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Admin save(Admin admin) {
        return repo.save(admin);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
