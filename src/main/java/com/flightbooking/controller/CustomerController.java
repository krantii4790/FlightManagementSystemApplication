package com.flightbooking.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightbooking.model.Custumer;
import com.flightbooking.service.CustomerService;


@RestController
@RequestMapping("/customerapi")
public class CustomerController {
	
	@Autowired
	   private CustomerService custService;
	   
//	   @RequestMapping(method= RequestMethod.GET, path="/allProducts") //replacement
	   
	   @GetMapping("/allCust")
	   public List<Custumer> findAllCustomer()
	   {
		   return custService.getAllCustomer();
	   }
	   
	   
	   @GetMapping("/{id}")
	   public Optional<Custumer> findCustumerById(@PathVariable int id)
	   {
		   return Optional.ofNullable(custService.getCustomerById(id).orElseThrow());
	   }
	   
	   @PostMapping("/addProduct")
	   public Custumer savingCustumer(@RequestBody Custumer customer)   
	   {
		   return custService.saveCustumer(customer);
	   }
	   
	   @PutMapping("/updateProduct/{id}")
	   public Custumer updateProduct(@PathVariable int id,@RequestBody Custumer customerdata)
	   {
		   Custumer custumer = custService.getCustomerById(id).orElseThrow();
		    
		   custumer.setArrival(customerdata.getArrival());
		   custumer.setDepature(customerdata.getDepature());
		   custumer.setDuration(customerdata.getDuration());
		   custumer.setFare(customerdata.getFare());
		   
		   return custService.saveCustumer(custumer);
	    }
	   
	   @DeleteMapping("/deleteProduct/{id}")
	   public void deletedeleteCustumerById(@PathVariable int id)
	   {
		   custService.deleteCustumerById(id);
	   }

}
