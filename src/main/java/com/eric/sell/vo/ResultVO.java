package com.eric.sell.vo;

import lombok.Data;

import java.util.List;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/19 23:16
 */
@Data
public class ResultVO<T> {
    /*错误码*/
    private Integer code;
    /*提示信息*/
    private String msg;
    /*具体内容*/
    private List<T> data;
}
