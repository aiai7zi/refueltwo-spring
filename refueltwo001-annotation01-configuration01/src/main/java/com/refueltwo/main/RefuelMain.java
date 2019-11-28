package com.refueltwo.main;

import com.refueltwo.main.config.RefuelConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
        System.out.println(app.getBean("sperson"));
    }

}
