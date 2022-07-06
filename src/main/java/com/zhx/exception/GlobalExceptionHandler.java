package com.zhx.exception;

import com.zhx.vo.RespBody;
import com.zhx.vo.StatusCode;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public RespBody ExceptionHandler(Exception e) {
        if (e instanceof SelfException) {
            SelfException exception = (SelfException) e;
            return RespBody.error(exception.getRespBeanEnum());
        } else if (e instanceof BindException) {
            BindException bindException = (BindException) e;
            RespBody respBody = RespBody.error(StatusCode.BIND_ERROR);
            respBody.setMessage("参数校验异常：" + bindException.getBindingResult().getAllErrors().get(0).getDefaultMessage());
            return respBody;
        }
        return RespBody.error(StatusCode.ERROR);
    }
}

