package com.oauth.server.config.security;

import com.oauth.server.domain.SysRole;
import com.oauth.server.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * Created by 陈龙飚 on 2017/12/28.
 */
@Component
public class UrlFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {

    @Autowired
    SysRoleService sysRoleService;

    AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) throws IllegalArgumentException {
        //获取请求地址
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        if ("/login.html".equals(requestUrl)) {
            return null;
        }
//        if ("/swagger-ui.html".equals(requestUrl)) {
//            return null;
//        }
        List<SysRole> allRole = sysRoleService.findAllRole();
        for (SysRole role : allRole) {
            if (antPathMatcher.match(role.getUrl(), requestUrl)) {
                String name = role.getName();
                return SecurityConfig.createList(name);
            }
        }
        //没有匹配上的资源，都是登录访问
        return SecurityConfig.createList("ROLE_LOGIN");
    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }
}
