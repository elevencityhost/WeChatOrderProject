package com.eric.sell.dao;

import com.eric.sell.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/21 22:41
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    List<OrderDetail> findByOrderId(String orderId);
}
