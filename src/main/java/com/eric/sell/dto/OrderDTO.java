package com.eric.sell.dto;

import com.eric.sell.OrderStatusEnum;
import com.eric.sell.PayStatusEnum;
import com.eric.sell.model.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/22 22:19
 */
@Data
public class OrderDTO {
    private String orderId;
    private String buyerName;
    private String buyerPhone;
    private String buyerAddress;
    private String buyerOpenid;
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private Integer payStatus;
    private Date createTime;
    private Date updateTime;
    List<OrderDetail> orderDetailList;
}
