package com.torero.springdemo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.torero.springdemo.model.CompanyModel;
import com.torero.springdemo.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository companyRepository;
	

    public Collection<CompanyModel> getCompanyList() {
       
    	return companyRepository.findCompany();
    }

}
