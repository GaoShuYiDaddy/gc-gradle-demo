package com.quzeng.gc_gradle_demo.bean.enums;

import lombok.Getter;

/**
 * @Auther: GC
 * @Date: 2018/7/13 14:56
 * @Description:
 */
@Getter
public enum ExceptionCodeEnum {
    PARAM_ERROR_CODE(40001,"参数错误"),
    ORDER_ALREADY_EXISTS(40101,"订单已存在"),
    ORDER_ALREADY_CLEARED(40102,"订单已清算");

    private Integer code;
    private String message;

    ExceptionCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
