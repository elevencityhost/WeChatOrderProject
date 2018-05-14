package com.eric.sell.dao;

import com.eric.sell.model.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/15 0:05
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;
    
    @Test
    public void findOneTest(){
        Optional<ProductCategory> productCategory = repository.findById(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveOneTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(2);
        repository.save(productCategory);
    }
}