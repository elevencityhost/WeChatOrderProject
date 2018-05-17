package com.eric.sell.dao;

import com.eric.sell.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/17 22:45
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String>{
    List<ProductInfo> findByProductStatus(Integer status);
}
