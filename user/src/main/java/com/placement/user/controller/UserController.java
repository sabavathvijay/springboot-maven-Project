package com.placement.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.placement.user.entity.UserEntity;
import com.placement.user.service.UserService;

/*
 ==> The  User-Controller class Manage the HTTP Services
 
  --> It handle the Services 
  
  1. GET
  2. POST
  3. DELETE
  4. UPDATE 
  
 
 */

// Mentioning is 
@RestController

public class UserController {
	
	
	//Injecting Dependency
	@Autowired
	public UserService us;
	
	
	
	// POST
	@PostMapping("/user/add")
	public UserEntity setUser(@RequestBody UserEntity user) {
		return us.setUser(user);
		
	}
	
	//GET
	@GetMapping("/user/get")
	public List<UserEntity> getUsers(){
		return us.getUser();
		
	}
	
	//DELETE
	
	@DeleteMapping("/user/ {id}")
	public void delete(@PathVariable Integer id) {
		
		us.delete(id);
		
	}
	
	
	// PUT (UPDATE )
	// The Updated Data will be Replace with New Object after the Previous Record(User)
	@PutMapping("/user/")
	public UserEntity updateUser(@RequestBody UserEntity user) {
		return us.updateUser(user);
		
	}
	

	
	
	

}
