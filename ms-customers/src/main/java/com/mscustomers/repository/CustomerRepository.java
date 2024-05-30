package com.mscustomers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mscustomers.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	 
	
	//Consultas personalizadas
	
}
