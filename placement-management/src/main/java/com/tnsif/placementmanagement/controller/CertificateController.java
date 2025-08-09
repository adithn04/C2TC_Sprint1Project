package com.tnsif.placementmanagement.controller;

import com.tnsif.placementmanagement.entity.Certificate;
import com.tnsif.placementmanagement.service.CertificateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/certificates")
public class CertificateController {
    private final CertificateService certificateService;

    public CertificateController(CertificateService certificateService) {
        this.certificateService = certificateService;
    }

    @GetMapping
    public List<Certificate> getAllCertificates() { return certificateService.getAllCertificates(); }

    @GetMapping("/{id}")
    public Certificate getCertificateById(@PathVariable Long id) {
        return certificateService.getCertificateById(id)
                .orElseThrow(() -> new RuntimeException("Certificate not found"));
    }

    @PostMapping
    public Certificate createCertificate(@RequestBody Certificate certificate) { return certificateService.createCertificate(certificate); }

    @PutMapping("/{id}")
    public Certificate updateCertificate(@PathVariable Long id, @RequestBody Certificate updatedCertificate) {
        return certificateService.updateCertificate(id, updatedCertificate);
    }

    @DeleteMapping("/{id}")
    public void deleteCertificate(@PathVariable Long id) { certificateService.deleteCertificate(id); }
}
