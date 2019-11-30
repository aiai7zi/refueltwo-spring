package com.refueltwo.main;

import com.refueltwo.main.config.RefuelConfig;
import com.refueltwo.main.po.OrderPo;
import com.refueltwo.main.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AutowiredRefuelMain
 * @See
 * @Author tanji
 * @Date 2019/11/30 14:04
 * @Version V1.0
 **/

public class AutowiredRefuelMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
         app = new AnnotationConfigApplicationContext(RefuelConfig.class);
        OrderService orderService = app.getBean(OrderService.class);
        OrderPo orderPo = orderService.getOrderById("123");
        System.out.println(orderPo);
    }
}
