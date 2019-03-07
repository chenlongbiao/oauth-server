package com.chen.oauth.server.service.impl;

import com.chen.oauth.server.domain.Permission;
import com.chen.oauth.server.dao.PermissionDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PermissionServiceImpl {

    @Autowired
    PermissionDao permissionDao;


    public List<Permission>  findAllPermission() {
        return permissionDao.findAll();
    }

    public List<Permission> findByAdminUserId(int userId) {
        return permissionDao.findByAdminUserId(userId);
    }
}
