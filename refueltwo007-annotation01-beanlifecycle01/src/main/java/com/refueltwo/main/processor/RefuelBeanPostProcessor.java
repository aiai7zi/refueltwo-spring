package com.refueltwo.main.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @ClassName RefuelBeanPostProcessor
 * @See
 * @Author tanji
 * @Date 2019/11/29 16:44
 * @Version V1.0
 **/

public class RefuelBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化前执行了："+beanName);

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("创建好后执行了："+beanName);
        return bean;
    }
}
