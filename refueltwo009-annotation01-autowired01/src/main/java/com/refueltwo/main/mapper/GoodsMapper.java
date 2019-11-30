package com.refueltwo.main.mapper;

import com.refueltwo.main.po.GoodsPo;

/**
 * @ClassName GoodsMapper
 * @See
 * @Author tanji
 * @Date 2019/11/30 14:02
 * @Version V1.0
 **/

public class GoodsMapper {

    public GoodsPo getGoodsById(String goodsId){
        return new GoodsPo(goodsId, "苹果", "50");
    }
}
