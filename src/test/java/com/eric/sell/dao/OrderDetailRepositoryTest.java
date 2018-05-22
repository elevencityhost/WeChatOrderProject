package com.eric.sell.dao;

import com.eric.sell.model.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/21 23:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("2");
        orderDetail.setOrderId("123456");
        orderDetail.setProductId("456");
        orderDetail.setProductName("酸辣粉");
        orderDetail.setProductPrice(new BigDecimal(6.5));
        orderDetail.setProductQuantity(3);
        orderDetail.setProductIcon("http://xxxxx.jpg");
        OrderDetail result = repository.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() throws Exception {
        List<OrderDetail> list = repository.findByOrderId("123456");
        Assert.assertNotEquals(0,list.size());
    }

}