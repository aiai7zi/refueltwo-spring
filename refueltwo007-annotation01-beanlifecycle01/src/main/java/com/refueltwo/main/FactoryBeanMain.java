package com.refueltwo.main;

import com.refueltwo.main.config.RefueltwoConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName FactoryBeanMain
 * @See
 * @Author tanji
 * @Date 2019/11/29 15:19
 * @Version V1.0
 **/

public class FactoryBeanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
        app = new AnnotationConfigApplicationContext(RefueltwoConfig.class);
        System.out.println(app.getBean("cat"));
        app.close();

    }
}
