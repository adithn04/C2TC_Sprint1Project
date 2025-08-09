package com.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.placementmanagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
