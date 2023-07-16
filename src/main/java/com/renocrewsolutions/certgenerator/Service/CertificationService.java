package com.renocrewsolutions.certgenerator.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.nimbusds.oauth2.sdk.auth.verifier.Hint;
import com.renocrewsolutions.certgenerator.entity.Certification;
import com.renocrewsolutions.certgenerator.entity.User;
import com.renocrewsolutions.certgenerator.repository.CertificationRepository;
import com.renocrewsolutions.certgenerator.repository.UserRepository;

public class CertificationService {
	
	  private  CertificationRepository certificationRepository;
	private Long certificationId;
	    @Autowired
	    public CertificationService(CertificationRepository certificationRepositoy) {
	        this.certificationRepository = certificationRepository;
	    }

	    public List<Certification> getAllCertifcation() {
	        return certificationRepository.findAll();
	    }

	    public Optional<Certification> getCertifcationById(Long certificationId) {
		
			return certificationRepository.findById(certificationId);
	    }

	    public Certification createCertification( Certification certification){
	        return certificationRepository.save(certification);
	    }
	    

	    public Certification updateCertification(Certification certification) {
	        return certificationRepository.save(certification);
	    }

	    public boolean deleteCertification(Long certificationId) {
	        certificationRepository.deleteById(certificationId);
			return false;
	    }


}
