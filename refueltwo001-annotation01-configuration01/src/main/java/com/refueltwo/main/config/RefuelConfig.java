package com.refueltwo.main.config;

import com.refueltwo.main.vo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName RefuelConfig
 * @See
 * @Author tanji
 * @Date 2019/11/28 18:44
 * @Version V1.0
 **/
@Configuration
public class RefuelConfig {
    @Bean(name = "sperson")
    public Person  getPerson(){
        return  new Person();
    }
}
