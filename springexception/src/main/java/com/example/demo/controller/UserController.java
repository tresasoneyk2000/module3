package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;
	@PostMapping("/create")
	
	public ResponseEntity<User> add(@RequestBody @Valid UserDTO user){
		
		return ResponseEntity.ok(service.create(user));
		
	}
	@PutMapping("/update/{id}")
	public ResponseEntity<?> update(@RequestBody UserDTO user,@PathVariable Long id) throws NotFoundException{
		return ResponseEntity.ok(service.update(user,id));
		
		
	}
	@DeleteMapping("/delete/{id}")
public 	ResponseEntity<?> delete(@PathVariable Long id){
		service.deleteid(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("deleted");
		
	}
}
