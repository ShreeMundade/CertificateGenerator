package com.renocrewsolutions.certgenerator.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.renocrewsolutions.certgenerator.entity.Certification;
import com.renocrewsolutions.certgenerator.entity.Exam;
import com.renocrewsolutions.certgenerator.repository.CertificationRepository;
import com.renocrewsolutions.certgenerator.repository.ExamRepository;

public class ExamService {
	
	  private  ExamRepository examRepository;
	private Long examId;
	    @Autowired
	    public ExamService( ExamRepository examRepository) {
	        this. examRepository =  examRepository;
	    }

	    public List<Exam> getAllExam() {
	        return  examRepository.findAll();
	    }

	    public Optional<Exam> getExamById(Long examId) {
		
			return examRepository.findById(examId);
	    }

	    public Exam createExam( Exam exam){
	        return examRepository.save(exam);
	    }
	    

	    public Exam updateExam(Exam exam) {
	        return examRepository.save(exam);
	    }

	    public boolean deleteExam(Long examId) {
	    	 examRepository.deleteById(examId);
			return false;
	    }


}
