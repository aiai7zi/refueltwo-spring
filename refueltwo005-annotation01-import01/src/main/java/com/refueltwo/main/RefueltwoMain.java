package com.refueltwo.main;

import com.refueltwo.main.config.RefueltwoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName RefueltwoMain
 * @See
 * @Author tanji
 * @Date 2019/11/29 14:26
 * @Version V1.0
 **/

public class RefueltwoMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
         app = new AnnotationConfigApplicationContext(RefueltwoConfig.class);
        for (String name : app.getBeanDefinitionNames()) {
            System.out.println("加载的Bean:"+name);
        }
    }
}
