package com.chen.oauth.server.service.impl;

import com.chen.oauth.server.dao.SysRoleDao;
import com.chen.oauth.server.domain.SysRole;
import com.chen.oauth.server.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 陈龙飚 on 2018/2/8 0008.
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    SysRoleDao sysRoleDao;

    public List<SysRole> findAllRole() {
        return sysRoleDao.findAll();
    }
}
