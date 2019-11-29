package com.refueltwo.main;

import com.refueltwo.main.config.RefueltwoConfig;
import com.refueltwo.main.vo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName RefuetwoMain
 * @See
 * @Author tanji
 * @Date 2019/11/29 12:36
 * @Version V1.0
 **/

public class RefuetwoMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(RefueltwoConfig.class);
//        Person person =(Person) app.getBean("person");
//        Person person1 = app.getBean("person", Person.class);
//        System.out.println(person==person1);
    }

}
