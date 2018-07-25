package com.wei.fruithome.utils;

import java.util.List;

/**
 * 通用resultBuild类
 * @author wangpf
 * @date 2018-7-25
 */
public class ResultBuilder {

    public static <T> Result<List<T>> buildResult(List<T> list) {
        Result<List<T>> result = new Result<List<T>>();
        result.setData(list);
        return result;
    }

    public static <T> Result<T> buildObjectResult(T t) {
        Result<T> result = new Result<T>();
        result.setData(t);
        return result;
    }

    public static Result<Object> buildResultCommon(Object obj){
        if(obj instanceof List){
            return buildResult((List)obj);
        }else {
            return buildObjectResult(obj);
        }
    }
}
