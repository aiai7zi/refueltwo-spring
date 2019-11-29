package com.refueltwo.main.factorybean;

import com.refueltwo.main.component.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName RefuelFactoryBean
 * @See
 * @Author tanji
 * @Date 2019/11/29 15:27
 * @Version V1.0
 **/

public class RefuelFactoryBean implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
