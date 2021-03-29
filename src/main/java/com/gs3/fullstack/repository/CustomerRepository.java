package com.gs3.fullstack.repository;

import com.gs3.fullstack.model.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
