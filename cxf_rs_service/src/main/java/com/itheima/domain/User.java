package com.itheima.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="user")
public class User {
    private  Integer age;
    private Integer id;
    private String name;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
