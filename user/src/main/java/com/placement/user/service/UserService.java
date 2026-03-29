package com.placement.user.service;

import java.util.List;

/*
 ===> The User-Services class Defines the Services for the to Injected Repository
 
 ================== Services ============================
 1. Insertion
 2. Retrieve
 3. Delete
 4. Update
 
 ---> These are the Services to Define in this Service-Package Class 
 
 
 
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.user.entity.UserEntity;
import com.placement.user.repository.UserRepo;

//Annotation to mention this is Class
@Service
public class UserService {
	// Injecting Dependency (Dependency Injection)
	@Autowired
  public UserRepo ur;
	
	
	//1. Insert Service
	public UserEntity setUser(UserEntity user) {
		return ur.save(user);
		
	}
	
	//2. Retrieve Service
	
	public List<UserEntity> getUser(){
		return ur.findAll();
		
	}
	
	
	//3.Delete Service
	
	public void delete(Integer id) {
		
		ur.deleteById(id);
	}
	
	//4. Update Service
	
	public  UserEntity updateUser(UserEntity user) {
		
		// User input id
		Integer userId = user.getUserId();
		
		// Finding Id from Database
		 //Selecting the User Object of the Specific ID Mentioned as user1  and Updating previous by Returning it into Table 
		UserEntity user1 =ur.findById( userId).get();
		
		//Updating the Data of User using Setters from the direct getter method as Argument
		user1.setUserName(user.getUserName());
		user1.setUserType(user.getUserType());
		user1.setUserPwd(user.getUserPwd());
		
		
		
		// Saving the Table with the Updated Data for user
		return ur.save(user1);
		
	}
	
	
	
	
	

}
