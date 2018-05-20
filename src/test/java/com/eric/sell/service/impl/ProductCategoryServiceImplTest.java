package com.eric.sell.service.impl;

import com.eric.sell.dao.ProductCategoryRepository;
import com.eric.sell.model.ProductCategory;
import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/16 22:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryServiceImplTest {
    @Autowired
    private ProductCategoryServiceImpl productCategoryServiceImpl;
    @Test
    public void findById() throws Exception {
        ProductCategory productCategory = productCategoryServiceImpl.findById(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void saveProductCategory() throws Exception {
        ProductCategory productCategory = productCategoryServiceImpl.saveProductCategory(new ProductCategory());
        Assert.assertEquals("男生专享",productCategory.getCategoryName());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> all = productCategoryServiceImpl.findAll();
        Assert.assertNotNull(all);
    }

    @Test
    public void deleteById() throws Exception {
        productCategoryServiceImpl.deleteById(3);
    }

    @Test
    public void findByCategoryTypeIn(){
        List<ProductCategory> list = productCategoryServiceImpl.findByCategoryTypeIn(Arrays.asList(10));
        Assert.assertEquals(1,list.size());
    }

}