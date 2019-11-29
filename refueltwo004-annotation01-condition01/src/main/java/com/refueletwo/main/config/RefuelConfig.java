package com.refueletwo.main.config;

import com.refueletwo.main.component.RefuelAdapter;
import com.refueletwo.main.component.RefuelLog;
import com.refueletwo.main.condition.RefuelCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @ClassName RefuelConfig
 * @See
 * @Author tanji
 * @Date 2019/11/29 13:49
 * @Version V1.0
 **/
@Configuration
public class RefuelConfig {
    @Bean("refuelLog")
    @Conditional(value = RefuelCondition.class)
    public RefuelLog getRefuelLog(){
        return new RefuelLog();
    }
    @Bean("refuelAdapter")
    @Conditional(value = RefuelCondition.class)
    public RefuelAdapter getRefuelAdapter(){
        return new RefuelAdapter();
    }

}
