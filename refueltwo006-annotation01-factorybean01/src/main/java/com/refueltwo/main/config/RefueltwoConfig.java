package com.refueltwo.main.config;

import com.refueltwo.main.factorybean.RefuelFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName RefueltwoConfig
 * @See
 * @Author tanji
 * @Date 2019/11/29 15:26
 * @Version V1.0
 **/
@Configuration
public class RefueltwoConfig {
    @Bean("refuelBean")
    public RefuelFactoryBean getRefuelFactoryBean(){

        return new RefuelFactoryBean();
    }
}
