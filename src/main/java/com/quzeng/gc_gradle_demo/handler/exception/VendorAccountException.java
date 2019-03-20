package com.quzeng.gc_gradle_demo.handler.exception;

/**
 * @Auther: GC
 * @Date: 2018/7/13 14:52
 * @Description:
 */
public class VendorAccountException extends RuntimeException {

    private Integer code;

    public VendorAccountException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
