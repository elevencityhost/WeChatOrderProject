package com.eric.sell.model;

import lombok.Data;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/23 20:23
 */
@Data
public class CartDTO {
    private String productId;
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public CartDTO() {
    }
}
