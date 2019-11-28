package com.refueltwo.main;

import com.refueltwo.main.config.RefuelConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName RefuelMain
 * @See
 * @Author tanji
 * @Date 2019/11/28 18:47
 * @Version V1.0
 **/

public class RefuelMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(RefuelConfig.class);
        for (String name : app.getBeanDefinitionNames()) {
            System.out.println("ioc容器中的："+name);
        }
//        System.out.println(app.getBean("refuelService"));

    }

}
