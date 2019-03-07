package com.chen.oauth.server.dao;

import com.chen.oauth.server.domain.SysRole;

import java.util.List;

/**
 * Created by 陈龙飚 on 18/1/29.
 */
public interface SysRoleDao {

    List<SysRole> findAll();
}
