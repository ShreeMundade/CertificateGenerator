package com.renocrewsolutions.certgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsolutions.certgenerator.entity.Certification;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Long> {
    // Add custom query methods if needed
}
