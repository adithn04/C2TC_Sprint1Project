package com.tnsif.placementmanagement.controller;

import com.tnsif.placementmanagement.entity.Certificate;
import com.tnsif.placementmanagement.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificates")
public class CertificateController {

    @Autowired
    private CertificateService service;

    @GetMapping
    public List<Certificate> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Certificate getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Certificate create(@RequestBody Certificate certificate) {
        return service.save(certificate);
    }

    @PutMapping("/{id}")
    public Certificate update(@PathVariable Long id, @RequestBody Certificate certificate) {
        certificate.setId(id);
        return service.save(certificate);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
