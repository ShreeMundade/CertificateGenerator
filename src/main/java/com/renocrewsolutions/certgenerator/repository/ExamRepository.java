package com.renocrewsolutions.certgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsolutions.certgenerator.entity.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
    // Add custom query methods if needed
}
