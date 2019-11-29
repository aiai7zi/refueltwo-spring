package com.refueltwo.main;

import com.refueltwo.main.config.ValueRefuelConfig;
import com.refueltwo.main.vo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName ValueRefuelMain
 * @See
 * @Author tanji
 * @Date 2019/11/29 17:43
 * @Version V1.0
 **/

public class ValueRefuelMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext
        app = new AnnotationConfigApplicationContext(ValueRefuelConfig.class);
        Person person = app.getBean("person", Person.class);
        System.out.println(person.getId());
        System.out.println(person.getName());
        System.out.println(person.getAge());
    }

}
