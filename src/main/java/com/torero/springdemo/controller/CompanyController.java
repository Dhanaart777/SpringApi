package com.torero.springdemo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.torero.springdemo.model.CompanyModel;

@RestController
@RequestMapping("/api")
public class CompanyController {
	
	@Autowired
	private  CompanyService companyService;
			
	@GetMapping(path = "/getCompany")
    public Collection<CompanyModel> findCarsAfterYear() {
        return companyService.getCompanyList();
    }
	
}
