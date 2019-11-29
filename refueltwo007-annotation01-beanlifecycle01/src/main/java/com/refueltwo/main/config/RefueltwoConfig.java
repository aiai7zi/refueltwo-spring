package com.refueltwo.main.config;


import com.refueltwo.main.component.Cat;
import com.refueltwo.main.component.Dog;
import com.refueltwo.main.component.Person;
import com.refueltwo.main.processor.RefuelBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName RefueltwoConfig
 * @See
 * @Author tanji
 * @Date 2019/11/29 15:26
 * @Version V1.0
 **/
@Configuration
public class RefueltwoConfig {
    @Bean(value = "cat",initMethod = "init",destroyMethod = "destroy")
    @Scope("singleton")
    public Cat getCat(){
        return new Cat();
    }

//   @Bean
   public RefuelBeanPostProcessor getRefuelBeanPostProcessor(){
        return new RefuelBeanPostProcessor();
   }
   @Bean("dog")
   @Scope("prototype")
   public Dog getDog(){
        return new Dog();
   }
   @Bean
   public Person getPerson(){

        return new Person();
   }


}
