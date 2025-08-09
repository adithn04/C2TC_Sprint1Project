package com.tnsif.placementmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.placementmanagement.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

