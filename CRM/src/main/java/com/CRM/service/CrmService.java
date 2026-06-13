package com.CRM.service;


import java.util.List;

import com.CRM.entity.Customer;


public interface CrmService {

	Customer add(Customer c);
	
	List<Customer> getAllCust();

}
