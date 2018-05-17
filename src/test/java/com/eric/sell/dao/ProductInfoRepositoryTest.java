package com.eric.sell.dao;

import com.eric.sell.model.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/17 22:47
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
    @Autowired
    private ProductInfoRepository repository;
    @Test
    public void saveOneTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1");
        productInfo.setProductName("酸辣粉");
        productInfo.setProductPrice(new BigDecimal(12.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("超级好吃的酸辣粉");
        productInfo.setProductIcon("http://jshdhhsd.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(10);
        ProductInfo productInfo1 = repository.save(productInfo);
        Assert.assertNotNull(productInfo1);
    }
}