package com.refueltwo.main.component;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @ClassName Person
 * @See
 * @Author tanji
 * @Date 2019/11/29 14:32
 * @Version V1.0
 **/

public class Person implements InitializingBean, DisposableBean {
    public Person() {
        System.out.println("我是人");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean:销毁了");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean:执行了");
    }
}
