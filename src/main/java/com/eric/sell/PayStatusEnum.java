package com.eric.sell;

import lombok.Getter;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/21 22:26
 */
@Getter
public enum PayStatusEnum {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功")
    ;
    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
