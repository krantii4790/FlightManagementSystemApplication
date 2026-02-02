package com.flightbooking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightbooking.model.Custumer;
import com.flightbooking.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerrepository;
	
	public List<Custumer> getAllCustomer() {
		return customerrepository.findAll();
	}

	public Optional<Custumer> getCustomerById(int id)
	{
		return customerrepository.findById(id);
	}
	
	public Custumer saveCustumer(Custumer custumer)
	{
		return customerrepository.save(custumer);
	}
	
	public void deleteCustumerById(int id)
	{
		customerrepository.deleteById(id);
	}
	
}
