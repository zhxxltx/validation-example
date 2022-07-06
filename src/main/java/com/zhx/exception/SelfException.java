package com.zhx.exception;


import com.zhx.vo.StatusCode;

public class SelfException extends RuntimeException {

    private StatusCode statusCode;

    public StatusCode getRespBeanEnum() {
        return statusCode;
    }

    public void setRespBeanEnum(StatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public SelfException(StatusCode statusCode) {
        this.statusCode = statusCode;
    }
}
