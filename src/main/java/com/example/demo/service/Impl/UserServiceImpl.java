package com.example.demo.service.Impl;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public boolean register(User u) {
		int num = userMapper.register(u);
		if (num > 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean login(User u) {
		int num = userMapper.login(u);
		if (num > 0) {
			return true;
		}
		return false;
	}
	
	
}
