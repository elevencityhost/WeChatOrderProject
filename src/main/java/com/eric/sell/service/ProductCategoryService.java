package com.eric.sell.service;

import com.eric.sell.model.ProductCategory;

import java.util.List;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/16 22:35
 */
public interface ProductCategoryService {
    ProductCategory findById(Integer id);
    ProductCategory saveProductCategory(ProductCategory productCategory);
    List<ProductCategory> findAll();
    void deleteById(Integer id);
}
