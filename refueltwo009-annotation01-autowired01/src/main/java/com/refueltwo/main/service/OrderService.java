package com.refueltwo.main.service;

import com.refueltwo.main.mapper.OrderMapper;
import com.refueltwo.main.po.OrderPo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName OrderService
 * @See
 * @Author tanji
 * @Date 2019/11/30 14:05
 * @Version V1.0
 **/

public class OrderService {
    @Autowired
    private OrderMapper orderMapperd;

      public OrderPo getOrderById(String orderId){
          return orderMapperd.getOrderById(orderId);
      }

}
