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
	
	public Boolean create(BeneficialOwner owner,String name) {
		Company existingCompany = repository.findByFirstname(owner.getFirstname());
		if (existingCompany != null && name.equals(existingCompany.getName())) 
			return false;
		
		//existingCompany.setOwners(repository.findByCompanyName(name));
		//owner.setCompany(existingCompany);
		
		BeneficialOwner saved = repository.save(owner);
		
		if (saved == null) 
			return false;
		
		return true;
	}
}
