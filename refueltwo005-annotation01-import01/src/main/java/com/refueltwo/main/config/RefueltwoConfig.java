package com.refueltwo.main.config;


import com.refueltwo.main.component.Animal;
import com.refueltwo.main.component.Person;
import com.refueltwo.main.importselector.RefueltwoImportBeanDefinitionRegistrar;
import com.refueltwo.main.importselector.RefuetwoImportSelector;
import org.springframework.context.annotation.Import;

/**
 * @ClassName RefueltwoConfig
 * @See
 * @Author tanji
 * @Date 2019/11/29 14:27
 * @Version V1.0
 **/
//@Import(value = {Person.class, Animal.class})
//@Import(value ={RefuetwoImportSelector.class} )
@Import(value ={RefueltwoImportBeanDefinitionRegistrar.class,Person.class} )
public class RefueltwoConfig {
}
