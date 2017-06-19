package com.jframework.dao;

import com.jframework.model.Role;

public interface RoleMapper {
    int insert(Role record);

    int insertSelective(Role record);
}