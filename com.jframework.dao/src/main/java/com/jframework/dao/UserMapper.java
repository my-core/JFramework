package com.jframework.dao;

import java.util.List;

import com.jframework.model.User;

public interface UserMapper {
	int insert(User record);

	int insertSelective(User record);

	List<User> getUserList();
}