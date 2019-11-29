package com.refueltwo.main.importselector;

import com.refueltwo.main.component.Cat;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName RefueltwoImportBeanDefinitionRegistrar
 * @See
 * @Author tanji
 * @Date 2019/11/29 14:54
 * @Version V1.0
 **/

public class RefueltwoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition  rootBeanDefinition=new RootBeanDefinition(Cat.class);
        registry.registerBeanDefinition("cat", rootBeanDefinition);
    }
}
