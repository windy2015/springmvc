package com.liuxch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuxch.dao.mapper.LoginLogMapper;
import com.liuxch.modal.LoginLog;
import com.liuxch.service.LoginLogService;

@Service
public class LoginLogServiceImpl implements LoginLogService{

	@Autowired
	private LoginLogMapper loginLogMapper;
	
	@Override
	public void insertLoginLog(LoginLog loginLog) {
		loginLogMapper.insertLoginLog(loginLog);
		
	}
	
}
