package com.renocrewsolutions.certgenerator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="certification")
public class Certification {
	
	@Id
	private int certiId;
	private String certiName;
	private String certiDescription;
<<<<<<< HEAD
	private double certiCost;
	
	
=======
	private String certiCost;

<<<<<<< HEAD
>>>>>>> 878d475dae405d14e749d47a0508a5efb67f88cd
=======
>>>>>>> 878d475dae405d14e749d47a0508a5efb67f88cd
	public Certification() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Certification(int certiId, String certiName, String certiDescription, double certiCost) {
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


	public double getCertiCost() {
		return certiCost;
	}


	public void setCertiCost(double certiCost) {
		this.certiCost = certiCost;
	}


	@Override
	public String toString() {
		return "Certification [certiId=" + certiId + ", certiName=" + certiName + ", certiDescription="
				+ certiDescription + ", certiCost=" + certiCost + "]";
	}
	
	

}
