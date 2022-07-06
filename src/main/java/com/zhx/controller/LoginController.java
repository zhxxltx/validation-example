package com.zhx.controller;

import com.zhx.vo.LoginVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class LoginController {

    @PostMapping("/login")
    public String login(@Valid LoginVo loginVo) {
        return "登录成功";
    }
}
