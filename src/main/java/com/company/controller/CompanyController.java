package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.company.entity.BeneficialOwner;
import com.company.entity.Company;
import com.company.service.BeneficialOwnerService;
import com.company.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	CompanyService companyService;
	
	@Autowired
	BeneficialOwnerService ownerService;
	
	@RequestMapping(value="/new" ,method = RequestMethod.POST)
	public Company createCompany(@RequestBody Company company) {
		
		return companyService.create(company) ? company:null;
		
	}
	
	
	@RequestMapping(value="/all" , method=RequestMethod.GET)
	public @ResponseBody List<Company> getAllCompanies() {
		
		return companyService.findAll();
	}
	
	@RequestMapping(value="/{companyName}" , method=RequestMethod.GET)
	public @ResponseBody Company getCompanyDetails(@PathVariable String companyName) {
		
		return companyService.getCompany(companyName);
	}
	
	@RequestMapping(value="/{companyName}" , method=RequestMethod.PUT)
	public Company updateCompany(@PathVariable String companyName,@RequestBody Company company) {
		
		return companyService.update(company) ? company:null;
		
	}
	
	@RequestMapping(value="/{companyName}/owners/add" , method=RequestMethod.POST)
	public Company addCompanyOwners(@PathVariable String companyName,@RequestBody BeneficialOwner owner) {
		Company company = companyService.getCompany(companyName);
		return ownerService.create(owner,company)? company:null;
	}
}
