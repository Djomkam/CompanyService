package com.company.repository;

import java.util.HashSet;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.BeneficialOwner;
import com.company.entity.Company;

public interface BeneficialOwnerRepository extends JpaRepository<BeneficialOwner,Long> {

	HashSet<BeneficialOwner> findByCompanyName(String name);
	Company findByFirstname(String firstname);
}
