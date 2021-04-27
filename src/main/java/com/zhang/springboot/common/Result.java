package com.zhang.springboot.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author zhangxinrun(OS - > zhang)
 * @Date 2021/4/27 7:48
 * @Version 1.0
 * @Description 统一返回结果
 */
@Data
public class Result implements Serializable {

    /**
     * 200为正常，非200为异常
     */
    private int code;
    private String message;
    private Object data;

    /**
     * 操作成功后返回的简便工具类
     * @param data  返回的数据
     * @return
     */
    public static Result success(Object data){
        return success(200, "操作成功", data);
    }

    /**
     * 成功返回自定义状态码，操作成功信息以及响应数据
     * @param code  状态码
     * @param message   操作信息
     * @param data  响应数据
     * @return
     */
    public static Result success(int code, String message, Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        if(data != null){
            result.setData(data);
        }
        return result;
    }

    /**
     * 失败返回自定义操作信息
     * @param msg   操作信息
     * @return
     */
    public static Result fail(String msg){
        return fail(400, msg, null);
    }

    /**
     * 失败返回自定义操作信息，数据
     * @param msg   操作信息
     * @param data  数据
     * @return
     */
    public static Result fail(String msg, Object data){
        return fail(400, msg, data);
    }

    /**
     * 返回失败自定义状态码，操作失败信息以及响应数据
     * @param code  状态码
     * @param message   失败操作信息
     * @param data  返回数据
     * @return
     */
    public static Result fail(int code, String message, Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        if(data != null){
            result.setData(data);
        }
        return result;
    }
}
