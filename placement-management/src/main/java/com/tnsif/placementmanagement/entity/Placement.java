package com.tnsif.placementmanagement.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "placements")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String companyName;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false)
    private LocalDate dateOfPlacement;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college;

    public Placement() {}

    public Placement(String companyName, String role, LocalDate dateOfPlacement, Student student, College college) {
        this.companyName = companyName;
        this.role = role;
        this.dateOfPlacement = dateOfPlacement;
        this.student = student;
        this.college = college;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public LocalDate getDateOfPlacement() { return dateOfPlacement; }
    public void setDateOfPlacement(LocalDate dateOfPlacement) { this.dateOfPlacement = dateOfPlacement; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public College getCollege() { return college; }
    public void setCollege(College college) { this.college = college; }
}
