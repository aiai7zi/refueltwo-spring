package com.refueltwo.main.filtertype;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName RefuelTypeFilter
 * @See
 * @Author tanji
 * @Date 2019/11/28 20:17
 * @Version V1.0
 **/

public class RefuelTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前扫描到的所有类
        AnnotationMetadata metadata = metadataReader.getAnnotationMetadata();
        //获取当前类的class的z信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
        System.out.println(className);
        if(className.contains("po"))
            return  true;
        System.out.println(metadata);
        return false;
    }
}
