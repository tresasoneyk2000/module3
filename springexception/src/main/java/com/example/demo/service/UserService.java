package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.exception.NotFoundException;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository user;
	
	public User create(UserDTO u) {
		User use=new User();
		use.setName(u.getName());
		use.setPlace(u.getPlace());
		
		return user.save(use);
		
	}
	public User update(UserDTO ut,Long id) throws NotFoundException {
		Optional<User> u= user.findById(id);
		User h=null;
		if(u.isPresent()) {
			h=u.get();
			h.setName(ut.getName());
			h.setPlace(ut.getPlace());
			return user.save(h);
			
			
		}
		else {
			throw new NotFoundException("notfoundd");
		}
		}
	public void deleteid(Long id) {
	 user.deleteById(id);
		
		
	}

}
