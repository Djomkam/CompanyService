package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.entity.Company;
import com.company.repository.BeneficialOwnerRepository;
import com.company.repository.CompanyRepository;


@Service
@Transactional
public class CompanyService {

	@Autowired
	CompanyRepository repository;
	
	@Autowired
	BeneficialOwnerRepository service;
	
	public Boolean create(Company company) {
		Company existingCompany = repository.findByName(company.getName());
		if (existingCompany != null) 
			return false;	
		
		Company saved = repository.save(company);
		if (saved == null) 
			return false;
		
		return true;
	}
	
	public Boolean update(Company company) {
		Company existingCompany = repository.findByName(company.getName());
		if (existingCompany == null) 
			return false;
		
		existingCompany.setCity(company.getCity());
		existingCompany.setCountry(company.getCountry());
		existingCompany.setAddress(company.getAddress());
		existingCompany.setEmail(company.getEmail());
		existingCompany.setName(company.getName());
		existingCompany.setPhone(company.getPhone());
				
		Company saved = repository.save(existingCompany);
		if (saved == null) 
			return false;
		
		return true;
	}
	
	public Boolean updateOwners(Company company) {
		
		Company saved = repository.save(company);
		if (saved == null) 
			return false;
		
		return true;
	}
	
	public Boolean delete(Company company) {
		Company existingCompany = repository.findByName(company.getName());
		if (existingCompany == null) 
			return false;
		
		repository.delete(existingCompany);
		Company deletedCompany = repository.findByName(company.getName());
		if (deletedCompany != null) 
			return false;
		
		return true;
	}
	
	public List<Company> findAll(){
		List<Company> list = repository.findAll();
		return list;
	}
	
	public Company getCompany(String companyName) {
		
		return repository.findByName(companyName);
	}
}
