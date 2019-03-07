package com.chen.oauth.server.dao;


import com.chen.oauth.server.domain.SysUser;

public interface UserDao {
    public SysUser findByUserName(String username);
}
