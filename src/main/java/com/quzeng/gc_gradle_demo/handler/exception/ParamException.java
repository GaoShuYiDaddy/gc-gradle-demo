package com.quzeng.gc_gradle_demo.handler.exception;

/**
 * @Auther: GC
 * @Date: 2018/7/13 14:52
 * @Description: 用户账户异常
 */
public class ParamException extends RuntimeException {

    private Integer code;

    public ParamException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
