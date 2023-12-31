package com.renocrewsolutions.certgenerator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="organization")
public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orgId;
	private String orgName;
	private String orgAddress;
	private String orgContact;
	
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Organization(int orgId, String orgName, String orgAddress, String orgContact) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.orgAddress = orgAddress;
		this.orgContact = orgContact;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgAddress() {
		return orgAddress;
	}

	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}

	public String getOrgContact() {
		return orgContact;
	}

	public void setOrgContact(String orgContact) {
		this.orgContact = orgContact;
	}

	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", orgAddress=" + orgAddress + ", orgContact="
				+ orgContact + "]";
	}

	public void setorgId(Long orgId2) {
		// TODO Auto-generated method stub
		
	}


}
