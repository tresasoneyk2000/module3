package com.ust.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.employee.entity.Bank;
import com.ust.employee.repository.BankRepository;

@Service
public class BankService {
	@Autowired
	BankRepository bankRepo;

	public Bank addaccount(Bank bank) {
		return bankRepo.save(bank);
		
	}
	
	public Bank find(long custid) {
		Optional<Bank> a=bankRepo.findById(custid);
		if(a.isPresent())
		return a.get();
		else
			return null;
	}
	public List<Bank> dis() {
		return bankRepo.findAll();
	}
public Bank update(Bank bank) {
	Bank a=null;
	Optional<Bank> t= bankRepo.findById(bank.getCustid());
	if(t.isPresent()) {
		a=t.get();
		a.setCustid(bank.getCustid());
		a.setAmount(bank.getAmount());
		a.setName(bank.getName());
		
		bankRepo.save(a);
		
	}
	else {
	bankRepo.save(bank);
	return bank;
	}
	return a;
	
}		
	
	
}
	


