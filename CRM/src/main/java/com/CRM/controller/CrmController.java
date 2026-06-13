package com.CRM.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRM.entity.Customer;
import com.CRM.service.CrmService;

@RestController
@RequestMapping("/customers")
public class CrmController {
	
	@Autowired
	CrmService service;
	
	@PostMapping("/add")
	public Customer save(@RequestBody Customer c) {
		return service.add(c);
	}
	
	
	@GetMapping("/get/all")
	public List<Customer> getAllCustomer(){
		return service.getAllCust();
	}
	
}
