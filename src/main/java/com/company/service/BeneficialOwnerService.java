package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.entity.BeneficialOwner;
import com.company.repository.BeneficialOwnerRepository;

@Service
@Transactional
public class BeneficialOwnerService {

	@Autowired
	BeneficialOwnerRepository repository;
	
	public Boolean create(BeneficialOwner owner) {
		BeneficialOwner existingOwner = repository.findOne(owner.getId());
		if (existingOwner != null) 
			return false;
		
		BeneficialOwner saved = repository.save(owner);
		if (saved == null) 
			return false;
		
		return true;
	}
}
