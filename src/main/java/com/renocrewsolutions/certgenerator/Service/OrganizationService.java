package com.renocrewsolutions.certgenerator.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.renocrewsolutions.certgenerator.entity.Certification;
import com.renocrewsolutions.certgenerator.entity.Organization;
import com.renocrewsolutions.certgenerator.repository.CertificationRepository;
import com.renocrewsolutions.certgenerator.repository.OrganizationRepository;

public class OrganizationService {

	  private  OrganizationRepository organizationRepository;
	private Long orgId;
	    @Autowired
	    public OrganizationService( OrganizationRepository  organizationRepository) {
	        this. organizationRepository =  organizationRepository;
	    }

	    public List<Organization> getAllOrganization() {
	        return organizationRepository.findAll();
	    }

	    public Optional<Organization> getOrganizationById(Long resultId) {
		
			return organizationRepository.findById(orgId);
	    }

	    public Organization createOrganization( Organization organization){
	        return organizationRepository.save(organization);
	    }
	    

	    public Organization updateOrganization(Organization organization) {
	        return organizationRepository.save(organization);
	    }

	    public void deleteCertification(Long orgId) {
	    	organizationRepository.deleteById(orgId);
	    }


}
