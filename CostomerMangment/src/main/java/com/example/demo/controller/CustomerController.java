package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Coustmer;
import com.example.demo.service.CoustemerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CustomerController {
	
	@Autowired
	CoustemerService customer;
	
	@PostMapping("/save")
	public String SaveCustomer(@RequestBody  Coustmer c)
	{
		customer.createCoustmer(c);
		
		return "Ok";
	}
	@DeleteMapping("delete/{id}")
    public String deleteCoustmer(@PathVariable ("id")int id) {
		
		
		return "deleteCustmoerSuccessfully";
	}
	@GetMapping("get/{uId}")
	
	public Coustmer  getCoustmer(@PathVariable int uId)
	{
		customer.getCoustmer(uId);
		return (Coustmer) customer;
		
	}
	
}
