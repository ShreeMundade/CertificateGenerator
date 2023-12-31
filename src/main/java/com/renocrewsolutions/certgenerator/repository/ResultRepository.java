package com.renocrewsolutions.certgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsolutions.certgenerator.entity.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    // Add custom query methods if needed
}
