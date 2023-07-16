package com.renocrewsolutions.certgenerator.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.renocrewsolutions.certgenerator.entity.Certification;
import com.renocrewsolutions.certgenerator.entity.Result;
import com.renocrewsolutions.certgenerator.repository.CertificationRepository;
import com.renocrewsolutions.certgenerator.repository.ResultRepository;

public class ResultService {

	  private  ResultRepository resultRepository;
		private Long resultId;
		    @Autowired
		    public ResultService(ResultRepository resultRepository) {
		        this.resultRepository = resultRepository;
		    }

		    public List<Result> getAllResult() {
		        return resultRepository.findAll();
		    }

		    public Optional<Result> getResultById(Long resultId) {
			
				return resultRepository.findById(resultId);
		    }

		    public Result createResult(  Result  result){
		        return resultRepository.save( result);
		    }
		    

		    public Result updateResult( Result  result) {
		        return resultRepository.save( result);
		    }

		    public boolean deleteResult(Long resultId) {
		    	resultRepository.deleteById(resultId);
				return false;
		    }
}
