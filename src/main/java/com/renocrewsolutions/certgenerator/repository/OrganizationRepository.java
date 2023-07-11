package com.renocrewsolutions.certgenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renocrewsolutions.certgenerator.entity.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    // Add custom query methods if needed
}
