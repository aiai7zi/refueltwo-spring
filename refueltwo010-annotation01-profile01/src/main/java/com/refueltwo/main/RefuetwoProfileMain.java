package com.refueltwo.main;

import com.refueltwo.main.config.RefuelConfig;
import com.refueltwo.main.po.OrderPo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName RefuetwoProfileMain
 * @See
 * @Author tanji
 * @Date 2019/11/30 15:34
 * @Version V1.0
 **/

public class RefuetwoProfileMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
         app = new AnnotationConfigApplicationContext();
        app.getEnvironment().setActiveProfiles("test");
        app.register(RefuelConfig.class);
        app.refresh();
        OrderPo orderPo = app.getBean(OrderPo.class);
        System.out.println(orderPo);

    }
}
