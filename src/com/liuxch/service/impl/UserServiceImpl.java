package com.liuxch.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuxch.dao.mapper.UserMapper;
import com.liuxch.modal.LoginLog;
import com.liuxch.modal.User;
import com.liuxch.service.LoginLogService;
import com.liuxch.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private LoginLogService loginLogService;
	
	@Override
	public Boolean hasMatchUser(User user) {
		
		Integer matchCount = userMapper.getMatchCount(user);
		if(matchCount > 0){
			return true;
		}else{
			return false;
		}
 
 
	}
 
	@Override
	public User findUserByUserName(User user) {
		return userMapper.findUserByUserName(user);
	}
 
	@Override
	public void loginSucess(User user) { 
		
		user.setLastVisit(new Date());
		LoginLog loginLog = new LoginLog();
		
		loginLog.setUserId(user.getUser_id());
		loginLog.setIp(user.getLastIp());
		loginLog.setLoginTime(new Date());
		
		
		userMapper.updateLoginInfo(user);
		loginLogService.insertLoginLog(loginLog);
	}
 
	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}
	
	@Override
	public void UpdateUser(User user) {
		userMapper.updateUserInfo(user);
	}

}
