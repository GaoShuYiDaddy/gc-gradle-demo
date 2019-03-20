package com.quzeng.gc_gradle_demo.handler.exception;

/**
 * @Auther: GC
 * @Date: 2018/8/1 15:50
 * @Description:
 */
public class VendorDividendOrderException extends RuntimeException {

    private Integer code;

    public VendorDividendOrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}