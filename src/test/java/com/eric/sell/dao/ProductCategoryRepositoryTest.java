package com.eric.sell.dao;

import com.eric.sell.model.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
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
        productCategory.setCategoryId(1);
        productCategory.setCategoryName("热销");
        productCategory.setCategoryType(2);
        repository.save(productCategory);
    }

    @Test
    public void deleteOneTest(){
        Optional<ProductCategory> productCategory = repository.findById(2);
        repository.deleteById(productCategory.get().getCategoryId());
    }

    @Test
    public void findAll(){
        List<ProductCategory> list = repository.findAll();
        Assert.assertNotEquals(null,list);
    }
}