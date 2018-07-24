package com.wei.fruithome.utils;

// 定义通用的返回类
public class Result<T> {
    // 返回状态
    private Integer status;

    // 返回的提示信息
    private String msg;

    // 返回的具体内容
    private T data;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
