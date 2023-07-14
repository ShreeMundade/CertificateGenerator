package com.renocrewsolutions.certgenerator.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="result")
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resultId;
	// this from user class ->id
	
	private User id;
	// this from Exam class -> examId
	
	private Exam examId;
	
	private int resultScore;
	private Date resultDate;
	
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(int resultId, User id, Exam examId, int resultScore, Date resultDate) {
		super();
		this.resultId = resultId;
		this.id = id;
		this.examId = examId;
		this.resultScore = resultScore;
		this.resultDate = resultDate;
	}

	public int getResultId() {
		return resultId;
	}

	public void setResultId(int resultId) {
		this.resultId = resultId;
	}

	public User getId() {
		return id;
	}

	public void setId(User id) {
		this.id = id;
	}

	public Exam getExamId() {
		return examId;
	}

	public void setExamId(Exam examId) {
		this.examId = examId;
	}

	public int getResultScore() {
		return resultScore;
	}

	public void setResultScore(int resultScore) {
		this.resultScore = resultScore;
	}

	public Date getResultDate() {
		return resultDate;
	}

	public void setResultDate(Date resultDate) {
		this.resultDate = resultDate;
	}

	@Override
	public String toString() {
		return "Result [resultId=" + resultId + ", id=" + id + ", examId=" + examId + ", resultScore=" + resultScore
				+ ", resultDate=" + resultDate + "]";
	}
	
	

}