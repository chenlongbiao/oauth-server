package com.oauth.server.service.impl;

import com.oauth.server.dao.PermissionDao;
import com.oauth.server.domain.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
