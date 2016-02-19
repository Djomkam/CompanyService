package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.BeneficialOwner;
import com.company.entity.Company;

public interface BeneficialOwnerRepository extends JpaRepository<BeneficialOwner,Long> {

	Company findByFirstname(String firstname);
}
