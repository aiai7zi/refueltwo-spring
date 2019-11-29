package com.refueltwo.main.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName RefuetwoImportSelector
 * @See
 * @Author tanji
 * @Date 2019/11/29 14:41
 * @Version V1.0
 **/

public class RefuetwoImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.refueltwo.main.component.Dog"};
    }
}
