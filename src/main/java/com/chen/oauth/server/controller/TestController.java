package com.chen.oauth.server.controller;

import com.chen.oauth.server.domain.SysRole;
import com.chen.oauth.server.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenlongbiao
 * @version V1.0
 * @Title:
 * @date 2018/10/15
 */
@RestController
@RequestMapping("/tController")
public class TestController {

    @Autowired
    SysRoleService sysRoleService;

    @RequestMapping("/admin")
    public String admin(){
        return "123";
    }

    @RequestMapping("getRoles")
    public List<SysRole> getRoles(){
        List<SysRole> allRole = sysRoleService.findAllRole();
        return allRole;
    }
}
