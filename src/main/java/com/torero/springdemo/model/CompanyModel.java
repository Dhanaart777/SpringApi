package com.torero.springdemo.model;

import javax.persistence.*;


@Entity

public class CompanyModel {

	@Id
	@Column
	private int CompanyId;

	@Column
	private String CompanyName;

	@Column
	private String GSTIN;

	
	
	
	public CompanyModel(){}



	public int getCompanyId() {
		return CompanyId;
	}


	public void setCompanyId(int companyId) {
		CompanyId = companyId;
	}


	public String getCompanyName() {
		return CompanyName;
	}


	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}


	public String getGSTIN() {
		return GSTIN;
	}


	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}


	


	
	
	
	
	

}
