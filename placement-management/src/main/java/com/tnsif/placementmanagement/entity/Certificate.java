package com.tnsif.placementmanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "certificates")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String certificateName;

    @Column(nullable = false)
    private LocalDate issuedDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    public Certificate() {}

    public Certificate(String certificateName, LocalDate issuedDate, Student student) {
        this.certificateName = certificateName;
        this.issuedDate = issuedDate;
        this.student = student;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCertificateName() { return certificateName; }
    public void setCertificateName(String certificateName) { this.certificateName = certificateName; }

    public LocalDate getIssuedDate() { return issuedDate; }
    public void setIssuedDate(LocalDate issuedDate) { this.issuedDate = issuedDate; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}
