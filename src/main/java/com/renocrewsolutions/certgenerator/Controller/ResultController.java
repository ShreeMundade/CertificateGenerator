package com.renocrewsolutions.certgenerator.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.renocrewsolutions.certgenerator.Service.ResultService;
import com.renocrewsolutions.certgenerator.entity.Result;

import jakarta.persistence.criteria.CriteriaBuilder.In;

import java.util.List;

@RestController
@RequestMapping("/results")
public class ResultController {

    private final ResultService resultService;
	private ResultService ResultService;

    @Autowired
    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping
    public ResponseEntity<List<Result>> getAllResults() {
        List<Result> results = resultService.getAllResults();
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    @GetMapping("/{resultId}")
    public ResponseEntity<Result> getResultById(@PathVariable Int resultId) {
		
    	this.Id = Id;
	
		Result result = resultService.getResultById(resultId);
        if (result != null) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Result> createResult(@RequestBody Result result) {
        Result createdResult = resultService.createResult(result);
        return new ResponseEntity<>(createdResult, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Result> updateResult(
            @PathVariable("id") Long id, @RequestBody Result result) {
        Result updatedResult = resultService.updateResult(id, result);
        if (updatedResult != null) {
            return new ResponseEntity<>(updatedResult, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResult(@PathVariable("id") Long id) {
        boolean deleted = resultService.deleteResult(id);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
