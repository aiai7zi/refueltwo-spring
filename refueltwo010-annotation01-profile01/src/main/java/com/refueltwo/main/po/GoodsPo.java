package com.refueltwo.main.po;

/**
 * @ClassName GoodsPo
 * @See
 * @Author tanji
 * @Date 2019/11/30 14:13
 * @Version V1.0
 **/

public class GoodsPo {
    private String goodsId;
    private String goodsName;
    private String price;

    public GoodsPo(String goodsId, String goodsName, String price) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
