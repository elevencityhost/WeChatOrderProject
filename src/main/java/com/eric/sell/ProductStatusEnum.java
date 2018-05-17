package com.eric.sell;

import lombok.Getter;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/17 23:32
 */
@Getter
public enum ProductStatusEnum {
    UP(1,"在架"),
    Down(0,"下架")
    ;
    private Integer code;
    private String message;

    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
