package com.eric.sell.service;

import com.eric.sell.model.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/17 23:15
 */
public interface ProductService {
    ProductInfo findOne(String productId);
    /*
    查询所有在架商品
     */
    List<ProductInfo> fingUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    //减库存
}
