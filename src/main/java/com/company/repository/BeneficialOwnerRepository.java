package com.company.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.BeneficialOwner;

public interface BeneficialOwnerRepository extends JpaRepository<BeneficialOwner,Long> {

	Collection<BeneficialOwner> findByCompanyName(String name);
}
