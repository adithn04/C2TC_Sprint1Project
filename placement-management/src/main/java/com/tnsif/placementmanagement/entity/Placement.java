package com.tnsif.placementmanagement.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "placements")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String jobRole;
    private String driveDate;

    @ManyToMany
    @JoinTable(
        name = "student_placements",
        joinColumns = @JoinColumn(name = "placement_id"),
        inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;

    @ManyToOne
    @JoinColumn(name = "college_id") // Foreign key to College
    private College college;

    public Placement() {}

    public Placement(String companyName, String jobRole, String driveDate, College college) {
        this.companyName = companyName;
        this.jobRole = jobRole;
        this.driveDate = driveDate;
        this.college = college;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public String getJobRole() { return jobRole; }
    public void setJobRole(String jobRole) { this.jobRole = jobRole; }
    public String getDriveDate() { return driveDate; }
    public void setDriveDate(String driveDate) { this.driveDate = driveDate; }
    public List<Student> getStudents() { return students; }
    public void setStudents(List<Student> students) { this.students = students; }
    public College getCollege() { return college; }
    public void setCollege(College college) { this.college = college; }
}
