package com.refueltwo.main.vo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName Person
 * @See
 * @Author tanji
 * @Date 2019/11/29 17:45
 * @Version V1.0
 **/

public class Person {
    @Value("${person.id}")
    private String id;
    @Value("张三")
    private String name;
    @Value("#{20-1}")
    private String age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
