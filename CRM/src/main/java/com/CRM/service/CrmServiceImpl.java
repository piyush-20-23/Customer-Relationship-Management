package com.CRM.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM.entity.Customer;
import com.CRM.repository.CrmRepository;


@Service
public class CrmServiceImpl implements CrmService{

	@Autowired
	CrmRepository repo;
	
	@Override
	public Customer add(Customer c) {
		return repo.save(c);
	}

	@Override
	public List<Customer> getAllCust() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	

}
