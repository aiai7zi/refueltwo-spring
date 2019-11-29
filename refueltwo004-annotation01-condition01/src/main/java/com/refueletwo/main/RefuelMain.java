package com.refueletwo.main;

import com.refueletwo.main.config.RefuelConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName RefuelMain
 * @See
 * @Author tanji
 * @Date 2019/11/29 13:58
 * @Version V1.0
 **/

public class RefuelMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
        app = new AnnotationConfigApplicationContext(RefuelConfig.class);
        for (String name : app.getBeanDefinitionNames()) {
            System.out.println("ioc容器中的name:"+name);
        }
    }
}
