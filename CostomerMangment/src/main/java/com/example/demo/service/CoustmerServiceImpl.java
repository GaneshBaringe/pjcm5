package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Coustmer;

import com.example.demo.repository.CoustmerRepository;
@Service
public class CoustmerServiceImpl implements CoustemerService{
     @Autowired
	CoustmerRepository coustmerrepository;
	
	@Override
	public void createCoustmer(Coustmer c) {
		coustmerrepository.save(c);
		
		
	}

	@Override
	public void deleteCoustmer(int cId) {
		coustmerrepository.deleteById(cId);
		
		
	}

	public Coustmer getCustomer(int cId) {
		return coustmerrepository.findById(cId).orElse(null);
		
	}

	@Override
	public void getCoustmer(int cId) {
		// TODO Auto-generated method stub
		
	}

}
