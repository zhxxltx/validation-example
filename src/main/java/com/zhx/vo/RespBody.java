package com.zhx.vo;

/**
 * 公共返回对象
 *
 * @author: LC
 * @date 2022/3/2 1:50 下午
 * @ClassName: RespBean
 */
public class RespBody {

    private long code;
    private String message;
    private Object object;

    public static RespBody success() {
        return new RespBody(StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage(), null);
    }

    public static RespBody success(Object object) {
        return new RespBody(StatusCode.SUCCESS.getCode(), StatusCode.SUCCESS.getMessage(), object);
    }

    public static RespBody error(StatusCode statusCode) {
        return new RespBody(statusCode.getCode(), statusCode.getMessage(), null);
    }

    public static RespBody error(StatusCode statusCode, Object object) {
        return new RespBody(statusCode.getCode(), statusCode.getMessage(), object);
    }

    public RespBody(long code, String message, Object object) {
        this.code = code;
        this.message = message;
        this.object = object;
    }

    public RespBody(){

    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
