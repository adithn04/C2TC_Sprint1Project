package com.tnsif.placementmanagement.service;

import com.tnsif.placementmanagement.entity.Certificate;
import com.tnsif.placementmanagement.repository.CertificateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateService {
    private final CertificateRepository certificateRepository;

    public CertificateService(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    public List<Certificate> getAllCertificates() { return certificateRepository.findAll(); }
    public Optional<Certificate> getCertificateById(Long id) { return certificateRepository.findById(id); }
    public Certificate createCertificate(Certificate certificate) { return certificateRepository.save(certificate); }
    public Certificate updateCertificate(Long id, Certificate updatedCertificate) {
        return certificateRepository.findById(id)
                .map(certificate -> {
                    certificate.setCertificateName(updatedCertificate.getCertificateName());
                    certificate.setIssuedDate(updatedCertificate.getIssuedDate());
                    certificate.setStudent(updatedCertificate.getStudent());
                    return certificateRepository.save(certificate);
                }).orElseThrow(() -> new RuntimeException("Certificate not found"));
    }
    public void deleteCertificate(Long id) { certificateRepository.deleteById(id); }
}
