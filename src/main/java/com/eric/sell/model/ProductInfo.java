package com.eric.sell.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/17 22:22
 */
@Entity
@Data
public class ProductInfo {
    @Id
    private String productId;
    //名字
    private String productName;
    //单价
    private BigDecimal productPrice;
    //库存
    private Integer productStock;
    //描述
    private String productDescription;
    //小图
    private String productIcon;
    //状态  0：正常  1：下架
    private Integer productStatus;
    //商品编号
    private Integer categoryType;
}
