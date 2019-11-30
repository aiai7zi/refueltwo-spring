package com.refueltwo.main.mapper;

import com.refueltwo.main.po.OrderPo;

/**
 * @ClassName OrderMapper
 * @See
 * @Author tanji
 * @Date 2019/11/30 13:59
 * @Version V1.0
 **/

public class OrderMapper {

    public OrderPo getOrderById(String orderId){
        return new OrderPo(orderId, "订单", "11.00");
    }
}
