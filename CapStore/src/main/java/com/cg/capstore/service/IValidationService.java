package com.cg.capstore.service;

import com.cg.capstore.exception.ValidationException;

public interface IValidationService {
	
	public String findMerchant(String emailId) throws ValidationException;
	public String findCustomer(String email)throws ValidationException;

}
