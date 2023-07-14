package com.renocrewsolutions.certgenerator.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.nimbusds.oauth2.sdk.auth.verifier.Hint;
import com.renocrewsolutions.certgenerator.entity.Certification;
import com.renocrewsolutions.certgenerator.entity.User;
import com.renocrewsolutions.certgenerator.repository.CertificationRepository;
import com.renocrewsolutions.certgenerator.repository.UserRepository;

public class CretificationService {
	
	  private  CertificationRepository certificationRepository;
	private Long resultId;
	    @Autowired
	    public CretificationService(CertificationRepository certificationRepositoy) {
	        this.certificationRepository = certificationRepository;
	    }

	    public List<Certification> getAllCertifcation() {
	        return certificationRepository.findAll();
	    }

	    public Optional<Certification> getCertifcationById(Long resultId) {
		
			return certificationRepository.findById(resultId);
	    }

	    public Certification createCertification( Certification certification){
	        return certificationRepository.save(certification);
	    }
	    

	    public Certification updateCertification(Certification certification) {
	        return certificationRepository.save(certification);
	    }

	    public void deleteCertification(Long resultId) {
	        certificationRepository.deleteById(resultId);
	    }


}