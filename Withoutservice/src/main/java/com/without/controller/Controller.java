package com.without.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.without.entity.Entity1;
import com.without.repository.Repo;

import jakarta.persistence.Entity;

@RestController
@RequestMapping("/user")

public class Controller {
	@Autowired
	Repo r;
	
	@PostMapping("/create")
	public ResponseEntity<Entity1> create(@RequestBody Entity1 en){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(r.save(en));
	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Entity1> fetch(@PathVariable long id){
		Optional<Entity1> op=r.findById(id);
		if(op.isPresent()) {
			
			Entity1 e=op.get();
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(e);
			
		}
		else {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
		}
	}
	
@DeleteMapping("/delete/{id}")
public ResponseEntity<?> delete(@PathVariable long id) {
	r.deleteById(id);
	return ResponseEntity.status(HttpStatus.ACCEPTED).body("deleted");
	
}
@GetMapping("/getall")
public ResponseEntity<List<Entity1>> fetch(){
	return ResponseEntity.status(HttpStatus.ACCEPTED).body(r.findAll());
	
}

}
