package com.renocrewsolutions.certgenerator.entity;


public class Certification {
	
	
	private int certiId;
	private String certiName;
	private String certiDescription;
	private String certiCost;
	
	
	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Certification(int certiId, String certiName, String certiDescription, String certiCost) {
		super();
		this.certiId = certiId;
		this.certiName = certiName;
		this.certiDescription = certiDescription;
		this.certiCost = certiCost;
	}


	public int getCertiId() {
		return certiId;
	}


	public void setCertiId(int certiId) {
		this.certiId = certiId;
	}


	public String getCertiName() {
		return certiName;
	}


	public void setCertiName(String certiName) {
		this.certiName = certiName;
	}


	public String getCertiDescription() {
		return certiDescription;
	}


	public void setCertiDescription(String certiDescription) {
		this.certiDescription = certiDescription;
	}


	public String getCertiCost() {
		return certiCost;
	}


	public void setCertiCost(String certiCost) {
		this.certiCost = certiCost;
	}


	@Override
	public String toString() {
		return "Certification [certiId=" + certiId + ", certiName=" + certiName + ", certiDescription="
				+ certiDescription + ", certiCost=" + certiCost + "]";
	}
	
	

}
