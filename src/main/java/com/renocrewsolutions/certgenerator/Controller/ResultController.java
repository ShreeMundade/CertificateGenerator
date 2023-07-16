package com.renocrewsolutions.certgenerator.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.renocrewsolutions.certgenerator.Service.ResultService;
import com.renocrewsolutions.certgenerator.entity.Result;

import jakarta.persistence.criteria.CriteriaBuilder.In;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/results")
public class ResultController {

    private final ResultService resultService;
	private ResultService ResultService;
	private Long resultId;

    @Autowired
    public ResultController(ResultService resultService) {
        this.resultService = resultService;
    }

    @GetMapping
    public ResponseEntity<List<Result>> getAllResults() {
        List<Result> results = resultService.getAllResult();
        return new ResponseEntity<>(results, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Result> getResultById(@PathVariable Long resultId) {
		
		Optional<Result> result = resultService.getResultById(resultId);
        if (result != null) {
            return new ResponseEntity<Result>(HttpStatus.OK);
        } else {
            return new ResponseEntity<Result>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Result> createResult(@RequestBody Result result) {
        Result createdResult = resultService.createResult(result);
        return new ResponseEntity<>(createdResult, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Result> updateResult(
            @PathVariable("resultId") Long resultId, @RequestBody Result result) {
        Result updatedResult = resultService.updateResult(result);
        if (updatedResult != null) {
            return new ResponseEntity<>(updatedResult, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResult(@PathVariable("resultId") Long resultid) {
        boolean deleted = resultService.deleteResult(resultId);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
