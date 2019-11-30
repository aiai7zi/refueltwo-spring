package com.refueltwo.main.service;

import com.refueltwo.main.mapper.GoodsMapper;
import com.refueltwo.main.po.GoodsPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @ClassName GoodsService
 * @See
 * @Author tanji
 * @Date 2019/11/30 14:18
 * @Version V1.0
 **/

public class GoodsService {
    @Qualifier("goodsMapper")
    @Autowired
    private GoodsMapper  goodsMapper;
    public GoodsPo getGoodsById(String goodsId){
        return goodsMapper.getGoodsById(goodsId);
    }
}
