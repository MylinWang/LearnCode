package com.gelin.demo.Exception;

public class Exception extends RuntimeException {

    private final Integer code;
    private final String message;

    public Exception( Integer code,String message) {
        this.code = code;
        this.message = message;
    }

    public Exception(ApiResponseError ex) {
        this(ex.getCode(),ex.getMessage());
    }


    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
