package com.renocrewsolutions.certgenerator.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="exam")

public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int examId;
	private String examName;
	private String examDescrption;
	private String examDuration;
	private Date exam_attempt_Date;
	
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Exam(int examId, String examName, String examDescrption, String examDuration, Date exam_attempt_Date) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examDescrption = examDescrption;
		this.examDuration = examDuration;
		this.exam_attempt_Date = exam_attempt_Date;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamDescrption() {
		return examDescrption;
	}

	public void setExamDescrption(String examDescrption) {
		this.examDescrption = examDescrption;
	}

	public String getExamDuration() {
		return examDuration;
	}

	public void setExamDuration(String examDuration) {
		this.examDuration = examDuration;
	}

	

	public Date getExam_attempt_Date() {
		return exam_attempt_Date;
	}

	public void setExam_attempt_Date(Date exam_attempt_Date) {
		this.exam_attempt_Date = exam_attempt_Date;
	}

	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + ", examDescrption=" + examDescrption
				+ ", examDuration=" + examDuration + ", exam_attemot_Date=" + exam_attempt_Date + "]";
	}
	
	

}
