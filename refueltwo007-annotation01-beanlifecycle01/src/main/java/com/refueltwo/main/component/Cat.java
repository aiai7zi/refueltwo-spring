package com.refueltwo.main.component;

import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName Cat
 * @See
 * @Author tanji
 * @Date 2019/11/29 14:55
 * @Version V1.0
 **/

public class Cat {
    public Cat() {
        System.out.println("我是汽车");
    }


    public void init(){
        System.out.println("初始化了");
    }
    public void destroy(){
        System.out.println("销毁了");
    }
}
