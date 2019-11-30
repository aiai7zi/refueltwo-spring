package com.refueltwo.main.config;

import com.refueltwo.main.po.OrderPo;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.util.StringValueResolver;

/**
 * @ClassName RefuelConfig
 * @See
 * @Author tanji
 * @Date 2019/11/30 15:45
 * @Version V1.0
 **/
@Configuration
public class RefuelConfig implements EmbeddedValueResolverAware {
    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        System.out.println(resolver);
    }
    @Bean
    @Profile("dev")
    public OrderPo newOrderPoDev(){
        return  new OrderPo("dev", "dev", "dev");
    }
    @Bean
    @Profile("test")
    public OrderPo newOrderPoTest(){
        return  new OrderPo("test", "test", "test");
    }
}
