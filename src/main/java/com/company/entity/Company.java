package com.company.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Company extends BaseEntity{

	@Column(name="Name", unique=true)
	private String name;
	
	private String street;
	private String city;
	private  String state;
	private String zip;
	private String country;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Phone")
	private String phone;
	
	@OneToMany(mappedBy = "company")
    private Set<BeneficialOwner> owners = new HashSet<>(); 
	
	public Company(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<BeneficialOwner> getOwners() {
		return owners;
	}

	public void setOwners(Set<BeneficialOwner> owners) {
		this.owners = owners;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
