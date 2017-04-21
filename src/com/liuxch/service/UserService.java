package com.liuxch.service;

import com.liuxch.modal.User;

public interface UserService {
 
    public Boolean hasMatchUser(User user);
	
	
	public User findUserByUserName(User user);
	
	
	public void loginSucess(User user);
	
	public void insertUser(User user);
 
 
	public void UpdateUser(User user);
 
}
