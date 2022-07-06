package com.zhx.vo;

import com.zhx.validator.IsMobile;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class LoginVo {

    @NotBlank(message = "手机号不能为空")
    @IsMobile(message = "手机号格式错误")
    private String mobile;

    @NotBlank(message = "密码不能为空")
    private String password;
}
