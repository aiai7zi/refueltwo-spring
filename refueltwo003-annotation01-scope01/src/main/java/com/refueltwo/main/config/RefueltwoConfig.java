package com.refueltwo.main.config;

import com.refueltwo.main.vo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName RefueltwoConfig
 * @See
 * @Author tanji
 * @Date 2019/11/29 12:37
 * @Version V1.0
 **/
@Configuration
public class RefueltwoConfig {
    @Bean("person")
    //@Scope("prototype")
    @Lazy(value = true)
    public Person getPerson(){
        return new Person();
    }

}
