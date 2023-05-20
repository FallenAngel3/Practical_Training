package com.example.demo.service;

import com.example.demo.bean.User;

public interface UserService {
	boolean register(User u);
	
	boolean login(User u);
}
