package com.gelin.demo.common;

import com.gelin.demo.Exception.ApiResponseError;

public class ApiResponse<T> {

    private Integer code;
    private String message;
    private T data;

    private static final int OK_CODE=10000;

    private static final String OK_MESSAGE="success";


    public ApiResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public ApiResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ApiResponse() {
        this.code = OK_CODE;
        this.message = OK_MESSAGE;
    }

    public static <T> ApiResponse<T> success() {
        return new ApiResponse<T>();
    }

    public static <T> ApiResponse<T> success(T data) {
        ApiResponse<T> response=new ApiResponse<T>();
        response.setData(data);
        return response;
    }

    public static <T> ApiResponse<T> error(ApiResponseError ex){
        return new ApiResponse<T>(ex.getCode(), ex.getMessage());
    }


    public static <T> ApiResponse<T> error(Integer code, String message){
        return new ApiResponse<T>(code,message);
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
