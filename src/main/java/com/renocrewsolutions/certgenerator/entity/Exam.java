package com.renocrewsolutions.certgenerator.entity;

import java.util.Date;

public class Exam {
	private int examId;
	private String examName;
	private String examDescrption;
	private String examDuration;
	private Date examDate;
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Exam(int examId, String examName, String examDescrption, String examDuration, Date examDate) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examDescrption = examDescrption;
		this.examDuration = examDuration;
		this.examDate = examDate;
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

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + ", examDescrption=" + examDescrption
				+ ", examDuration=" + examDuration + ", examDate=" + examDate + "]";
	}
	
	

}
