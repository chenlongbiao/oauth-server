package com.oauth.server.dao;


import com.oauth.server.domain.SysUser;

public interface UserDao {
    public SysUser findByUserName(String username);
}
