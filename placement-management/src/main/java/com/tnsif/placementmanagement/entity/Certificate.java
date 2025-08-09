package com.tnsif.placementmanagement.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "certificates")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String certificateName;
    private String issueDate;

    @OneToOne
    @JoinColumn(name = "student_id") // Foreign key to Student
    private Student student;

    public Certificate() {}

    public Certificate(String certificateName, String issueDate, Student student) {
        this.certificateName = certificateName;
        this.issueDate = issueDate;
        this.student = student;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCertificateName() { return certificateName; }
    public void setCertificateName(String certificateName) { this.certificateName = certificateName; }
    public String getIssueDate() { return issueDate; }
    public void setIssueDate(String issueDate) { this.issueDate = issueDate; }
    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }
}

