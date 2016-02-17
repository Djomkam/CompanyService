package com.company.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CompanyNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5558066124442440495L;

	public CompanyNotFoundException(String companyName) {
		super("could not find Company '" + companyName + "'.");
	}
}
