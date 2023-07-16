package com.renocrewsolutions.certgenerator.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renocrewsolutions.certgenerator.Service.ExamService;
import com.renocrewsolutions.certgenerator.entity.Exam;

//import com.renocrewsolutions.certgenerator.entity.Exam;


@RestController
@RequestMapping("/exam")
public class ExamController {

 
    private ExamService examService;

	@Autowired
    public ExamController(ExamService examService) {
        this.examService = examService;
    }

    @GetMapping
    public ResponseEntity<List<Exam>> getAllExams() {
        List<Exam> exams = examService.getAllExam();
        return new ResponseEntity<>(exams, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exam> getExamById(@PathVariable Long examId) {
		
		Optional<Exam> exam = examService.getExamById(examId);
        if (exam != null) {
            return new ResponseEntity<Exam>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Exam>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Exam> createExam(@RequestBody Exam  exam ) {
    	Exam createdExam = examService.createExam(exam);
        return new ResponseEntity<>(createdExam, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exam> updateExam(@PathVariable("examId") Long examId, @RequestBody Exam exam) {
    	Exam updatedExam = examService.updateExam(exam);
        if (updatedExam != null) {
            return new ResponseEntity<>(updatedExam, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }   


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResult(@PathVariable("resultId") Long resultid, Long examId) {
        
		boolean deleted = examService.deleteExam(examId);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }    
}