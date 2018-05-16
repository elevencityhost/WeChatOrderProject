package com.eric.sell.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/14 23:58
 */
@Entity
@Data
public class ProductCategory {
    @Id
    @GeneratedValue
    //类目id
    private Integer categoryId;
    //类目名称
    private String categoryName;
    //类目编号
    private Integer categoryType;
}
