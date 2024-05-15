package com.gelin.demo.Exception;

public enum ApiResponseError {

    SUCESS(10001,"用户名错误"),
    USER_NAME_ERROR(10002,"用户名不能为空"),
    USER_PASSWORD_ERROR(10003,"密码不能为空"),
    USER_USERNAME_NOTNULL(10004,"用户名已存在"),
    USER_REGISTER_ERROR(10005,"注册失败"),
    USER_REGISTER_SUCCESS(10006,"注册成功"),
    USER_PASSWORD_LENGTH(10007,"密码长度不能小于6位"),
    USER_NAME_NULL(10008,"用户名不存在"),
    USER_PASSWORD_WRONG(10009,"密码错误"),
    USER_NEED_LOGIN(10010,"用户未登录"),
    USER_PASSWORD_CHANGE_ERROR(10011,"密码更改失败"),
    USER_ROLE_CHANGE_ERROR(10012,"更改失败权限"),
    USER_PHONE_NUMBER_EXIST(10013,"手机号码已存在"),
    PHONE_SEND_ERROR(10014,"验证码发送失败"),
    PHONE_SENDS(10015,"验证码已发送,请勿再次发送"),
    PHONE_NUMBER_ERROR(10016,"手机号码有误"),
    PHONE_NUMBER_NOT_NULL(10017,"手机不能为空"),
    NEED_VERIFICATION_CODE(10018,"验证码不能为空"),
    WRONG_VERIFICATION_CODE(10019,"验证码错误"),
    SYSTEM_ERROR(20000,"系统错误");


    Integer code;
    String message;


    ApiResponseError(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
