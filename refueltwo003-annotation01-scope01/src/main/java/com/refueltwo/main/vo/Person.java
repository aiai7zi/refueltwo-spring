package com.refueltwo.main.vo;

/**
 * @ClassName Person
 * @See
 * @Author tanji
 * @Date 2019/11/29 12:39
 * @Version V1.0
 **/

public class Person {
    private String  id;
    private String name;

    public Person() {
        System.out.println("构造方法执行了");
    }

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
}
