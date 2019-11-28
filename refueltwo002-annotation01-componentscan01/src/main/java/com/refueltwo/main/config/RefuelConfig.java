package com.refueltwo.main.config;


import com.refueltwo.main.filtertype.RefuelTypeFilter;
import com.refueltwo.main.vo.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


/**
 * @ClassName RefuelConfig
 * @See
 * @Author tanji
 * @Date 2019/11/28 18:44
 * @Version V1.0
 **/
@Configuration
/*@ComponentScan(basePackages = "com.refueltwo.main",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class, Service.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM,value = {Controller.class})
})*/
@ComponentScan(basePackages = "com.refueltwo.main",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = { Service.class,Controller.class})
//        , @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {RefuelService.class})
        @ComponentScan.Filter(type = FilterType.CUSTOM,value = {RefuelTypeFilter.class})
},useDefaultFilters = false)
public class RefuelConfig {
    @Bean(name = "sperson")
    public Person  getPerson(){
        return  new Person();
    }
}
