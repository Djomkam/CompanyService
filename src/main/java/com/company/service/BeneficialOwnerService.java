package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.entity.BeneficialOwner;
import com.company.entity.Company;
import com.company.repository.BeneficialOwnerRepository;

@Service
@Transactional
public class BeneficialOwnerService {

	@Autowired
	BeneficialOwnerRepository repository;
	
	@Autowired
	CompanyService rep;
	
	public Boolean create(BeneficialOwner owner,Company company) {
		
		//determine if the company already exist and if yes id the owner already a beneficiary?
		Company existingCompany = repository.findByFirstname(owner.getFirstname());
		
		if (existingCompany != null && company.getName().equals(existingCompany.getName())) 
			return false;
		owner.setCompany(company);
		
		BeneficialOwner saved = repository.save(owner);
		
		if (saved == null) 
			return false;
		
		company.getOwners().add(saved);
		rep.updateOwners(company);
		
		return true;
	}
}
