package com.refueltwo.main.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName Dog
 * @See
 * @Author tanji
 * @Date 2019/11/29 14:42
 * @Version V1.0
 **/

public class Dog {
    {
        System.out.println("我是Dog类中的匿名构造方法");
    }


    public Dog() {
        System.out.println("我是Dog类的构造方法");
    }
    @PostConstruct
    public void init(){
        System.out.println("Dog类中init方法执行了");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Dog类中的destroy方法执行了");
    }
}
