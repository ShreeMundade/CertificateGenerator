package com.renocrewsolutions.certgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsolutions.certgenerator.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Add custom query methods if needed
}
