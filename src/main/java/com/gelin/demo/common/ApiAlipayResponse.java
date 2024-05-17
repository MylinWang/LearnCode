package com.gelin.demo.common;

import com.gelin.demo.Exception.ApiResponseError;

public class ApiAlipayResponse<T> {

    private T data;

    public ApiAlipayResponse() {
    }

    public ApiAlipayResponse(T data) {
        this.data = data;
    }

    public static <T> ApiAlipayResponse<T> success(T result) {
        return new ApiAlipayResponse<T>(result);
    }

    public static <T> ApiAlipayResponse<T> error(T data) {
        return new ApiAlipayResponse<T>(data);
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
