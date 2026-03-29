package com.placement.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table

public class UserEntity {
	
	// Defining the Data 
	
	//======= User-ID =======
	
	/*
	
	
	@Id
	public long userId;
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	*/
	
	
	//=====================================================
	
	
	@Id
	public Integer userId;
	
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
	
	
	
	
	
	
	//==========================================================
	
	// ======= User Name =======
	
	public String userName;
	

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	//=========User-Type ==========
	
	public String userType;
	
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	// =======User - Password =========
	
	public String userPwd;
	
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	
	
	

}
