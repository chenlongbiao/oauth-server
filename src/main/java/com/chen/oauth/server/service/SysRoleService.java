package com.chen.oauth.server.service;
import com.chen.oauth.server.domain.SysRole;

import java.util.List;

/**
 * @author chenlongbiao
 * @version V1.0
 * @Title:
 * @date 2018/10/9
 */
public interface SysRoleService  {
    public List<SysRole> findAllRole();
}
