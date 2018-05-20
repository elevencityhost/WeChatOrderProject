package com.eric.sell.service.impl;

import com.eric.sell.dao.ProductInfoRepository;
import com.eric.sell.model.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/17 23:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductServiceImpl productService;
    @Test
    public void findOne() throws Exception {
        ProductInfo productInfo = productService.findOne("1");
        Assert.assertEquals("1",productInfo.getProductId());
    }

    @Test
    public void fingUpAll() throws Exception {
        List<ProductInfo> list = productService.fingUpAll();
        Assert.assertNotEquals(1,list.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest = new PageRequest(0, 2);
        Page<ProductInfo> productInfoPage = productService.findAll(pageRequest);
        System.out.println(productInfoPage.getTotalElements());
    }

    @Test
    @Transactional
    public void save() throws Exception {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("4");
        productInfo.setProductName("重庆小面");
        productInfo.setProductPrice(new BigDecimal(18.5));
        productInfo.setProductStock(5);
        productInfo.setProductDescription("超辣的重庆小面");
        productInfo.setProductIcon("http://jshdhhsd.jpg");
        productInfo.setProductStatus(1);
        productInfo.setCategoryType(10);
        ProductInfo productInfo1 = productService.save(productInfo);
        //Assert.assertEquals("4",productInfo1.getProductId());
    }



}