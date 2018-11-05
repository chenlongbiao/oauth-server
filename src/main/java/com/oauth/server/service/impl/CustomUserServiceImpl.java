package com.oauth.server.service.impl;


import com.oauth.server.dao.UserDao;
import com.oauth.server.domain.SysUser;
import com.oauth.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.codec.Utf8;

import java.util.Base64;


public class CustomUserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) { //重写loadUserByUsername 方法获得 userdetails 类型用户
        SysUser user = userDao.findByUserName(username);
        if(user == null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }

    public static void main(String[] args) {
        String pwd = "testclient";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // 加密
        String encodedPassword = passwordEncoder.encode(pwd);
        System.out.println(encodedPassword);
        boolean matches = passwordEncoder.matches("{bcrypt}"+encodedPassword, "{bcrypt}"+encodedPassword);
        System.out.println(matches);
        byte[] decode = Base64.getDecoder().decode(Utf8.encode("PlT5fqqyiKt/HJzy7JPrhO9Fo80W7YkHxxNdXkF37GZ1WJmtzcvl"));
        System.out.println(decode);

    }
}
