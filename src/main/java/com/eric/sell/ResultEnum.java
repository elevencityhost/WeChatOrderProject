package com.eric.sell;

import lombok.Getter;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/22 22:48
 */
@Getter
public enum ResultEnum {
    PRODUCT_NOT_EXIST(10,"商品不存在")
    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
