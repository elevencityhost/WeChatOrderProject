package com.eric.sell.dao;

import com.eric.sell.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/15 0:03
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
}
