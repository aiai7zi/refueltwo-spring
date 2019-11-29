package com.refueletwo.main.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName RefuelCondition
 * @See
 * @Author tanji
 * @Date 2019/11/29 13:51
 * @Version V1.0
 **/

public class RefuelCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if(context.getBeanFactory().containsBean("refuelLog")) {
            return true;
        }
        return false;


    }
}
