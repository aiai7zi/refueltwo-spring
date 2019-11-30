package com.refueltwo.main.po;

/**
 * @ClassName OrderPo
 * @See
 * @Author tanji
 * @Date 2019/11/30 14:07
 * @Version V1.0
 **/

public class OrderPo {

    private String orderId;
    private String orderName;
    private String price;

    public OrderPo(String orderId, String orderName, String price) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderPo{" +
                "orderId='" + orderId + '\'' +
                ", orderName='" + orderName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
