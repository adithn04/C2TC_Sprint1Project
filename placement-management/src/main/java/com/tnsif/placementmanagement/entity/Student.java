package com.tnsif.placementmanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String course;

    @Column
    private int year;

    @ManyToOne
    @JoinColumn(name = "college_id")
    private College college; // Relationship with College

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user; // Link Student to User account

    // Constructors
    public Student() {}

    public Student(Long id, String name, String course, int year, College college, User user) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.year = year;
        this.college = college;
        this.user = user;
    }

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
