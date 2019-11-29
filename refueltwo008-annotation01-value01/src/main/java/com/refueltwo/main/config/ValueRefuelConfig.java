package com.refueltwo.main.config;

import com.refueltwo.main.vo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName ValueRefuelConfig
 * @See
 * @Author tanji
 * @Date 2019/11/29 17:45
 * @Version V1.0
 **/
@Configuration
@PropertySource(value = {"classpath:person.properties"})
public class ValueRefuelConfig {

    @Bean("person")
    public Person getPerson(){
        return new Person();
    }
}
