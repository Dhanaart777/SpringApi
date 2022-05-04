package com.torero.springdemo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.torero.springdemo.model.CompanyModel;

@Repository
public interface CompanyRepository  extends JpaRepository<CompanyModel, Long>{
	
	 @Query(value = "exec Med_SP_DS_Branch_List 'NcLZ68NpKZv7HYZx8g5cnphYFa6ncXyHkDEpr3f2' ,1", nativeQuery = true)
	 public Collection<CompanyModel> findCompany();

	 
	 @Query(nativeQuery = true, value="exec Med_SP_DS_Company_List 'NcLZ68NpKZv7HYZx8g5cnphYFa6ncXyHkDEpr3f2'")
	 public Collection<CompanyModel> queryAnnotated();
	 
}
