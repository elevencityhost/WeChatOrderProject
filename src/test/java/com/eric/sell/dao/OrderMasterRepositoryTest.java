package com.eric.sell.dao;

import com.eric.sell.model.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/21 22:53
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository repository;

    private final String OPENID = "110110";

    @Test
    public void saveTest(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("654321");
        orderMaster.setBuyerName("beibei");
        orderMaster.setBuyerPhone("15901506714");
        orderMaster.setBuyerAddress("海淀");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(6.5));
        OrderMaster master = repository.save(orderMaster);
        Assert.assertNotNull(master);
    }


    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest pageRequest = new PageRequest(0, 1);
        Page<OrderMaster> page = repository.findByBuyerOpenid(OPENID, pageRequest);
        System.out.println(page.getTotalElements());
    }

}