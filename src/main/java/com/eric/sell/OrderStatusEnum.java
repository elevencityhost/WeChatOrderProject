package com.eric.sell;

import lombok.Getter;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/21 22:20
 */
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"取消")
    ;
    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
