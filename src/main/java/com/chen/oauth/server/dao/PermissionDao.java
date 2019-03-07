package com.chen.oauth.server.dao;

import com.chen.oauth.server.domain.Permission;

import java.util.List;

/**
 * Created by 陈龙飚 on 18/1/29.
 */
public interface PermissionDao {
    public List<Permission> findAll();
    public List<Permission> findByAdminUserId(int userId);
}
