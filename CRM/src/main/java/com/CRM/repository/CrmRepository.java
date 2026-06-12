package com.CRM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRM.entity.Customer;

@Repository
public interface CrmRepository extends JpaRepository<Customer, Integer>{

}
