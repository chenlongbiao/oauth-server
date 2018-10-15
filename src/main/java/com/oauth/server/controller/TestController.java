package com.oauth.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenlongbiao
 * @version V1.0
 * @Title:
 * @date 2018/10/15
 */
@RestController
public class TestController {

    @RequestMapping("/admin")
    public String admin(){
        return "123";
    }
}
