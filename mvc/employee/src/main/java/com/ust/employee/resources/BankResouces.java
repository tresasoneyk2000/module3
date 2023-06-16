package com.ust.employee.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.employee.entity.Bank;
import com.ust.employee.repository.BankRepository;
import com.ust.employee.service.BankService;

@RestController
@RequestMapping("/api.2/")
public class BankResouces {
	@Autowired
	BankService service;
	
	@PostMapping
	@RequestMapping("/create")
	
	public Bank add(@RequestBody Bank bank) {
		return service.addaccount(bank);
		
		
	}
	
	@GetMapping
	@RequestMapping("/acc/{custid}")
	
	public Bank retrieve(@PathVariable long custid) {
		return service.find(custid);
		
		
		
	}
	
	@GetMapping
	@RequestMapping("/acc/all")
	
	public List<Bank> display() {
		return service.dis();
		
		
		
	}
	@PutMapping
	@RequestMapping("/acc/update")
	
	public Bank up(@RequestBody Bank bank) {
		return service.update(bank);
	}
	
	
	
	

}
