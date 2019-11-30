package com.refueltwo.main.config;

import com.refueltwo.main.mapper.GoodsMapper;
import com.refueltwo.main.mapper.OrderMapper;
import com.refueltwo.main.service.GoodsService;
import com.refueltwo.main.service.OrderService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * @ClassName RefuelConfig
 * @See
 * @Author tanji
 * @Date 2019/11/30 14:20
 * @Version V1.0
 **/
@Configuration
public class RefuelConfig {
    @Bean("goodsMapper")
    public GoodsMapper getGoodsMapper(){
        return new GoodsMapper();
    }
    @Bean("orderMapper1")
    public OrderMapper getOrderMapper(){
        return new OrderMapper();
    }
    @Bean("goodsService")
    public GoodsService getGoodsService(){
        return new GoodsService();
    }
    @Primary
    @Bean(value = "orderService",autowire = Autowire.BY_TYPE)
    public OrderService getOrderService(){
        return new OrderService();
    }




}
