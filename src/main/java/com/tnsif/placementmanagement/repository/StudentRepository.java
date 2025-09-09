package com.tnsif.placementmanagement.repository;

import com.tnsif.placementmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // You can add custom finders if needed
    Student findByName(String name);
}
