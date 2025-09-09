package com.tnsif.placementmanagement.service;

import com.tnsif.placementmanagement.entity.Certificate;
import com.tnsif.placementmanagement.repository.CertificateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository repo;

    public List<Certificate> getAll() {
        return repo.findAll();
    }

    public Certificate getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Certificate save(Certificate certificate) {
        return repo.save(certificate);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
