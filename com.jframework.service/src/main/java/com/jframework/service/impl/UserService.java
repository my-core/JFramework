package com.jframework.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jframework.dao.UserMapper;
import com.jframework.model.User;
import com.jframework.service.IUserService;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserMapper userMapper;

	public List<User> GetUserList() {
		// TODO Auto-generated method stub
		return userMapper.getUserList();
	}

}
