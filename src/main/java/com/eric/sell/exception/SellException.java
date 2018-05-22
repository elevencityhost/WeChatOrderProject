package com.eric.sell.exception;

import com.eric.sell.ResultEnum;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/22 22:52
 */
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
